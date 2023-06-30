package com.microservices.email.consumers;

import com.microservices.email.dto.requests.EmailRequest;
import com.microservices.email.model.EmailModel;
import com.microservices.email.services.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailRequest dto) {
        var email = EmailModel.of(dto);
        emailService.sendEmail(email);
        log.info("Email Status: " + email.getStatusEmail().toString());
    }
}
