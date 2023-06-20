package com.microservices.email.controllers;

import com.microservices.email.dto.requests.EmailRequest;
import com.microservices.email.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;


    @PostMapping("sending-email")
    public void sendingEmail(@RequestBody @Valid EmailRequest dto) {
        emailService.sendEmail(dto);
    }

}
