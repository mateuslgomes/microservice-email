package com.microservices.email.model;

import com.microservices.email.dto.requests.EmailRequest;
import com.microservices.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "email")
@Builder
public class EmailModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    public static EmailModel of(EmailRequest dto) {
        return EmailModel.builder()
                .emailFrom(dto.emailFrom())
                .emailTo(dto.emailTo())
                .ownerRef(dto.ownerRef())
                .subject(dto.subject())
                .text(dto.text())
                .sendDateEmail(LocalDateTime.now())
                .build();
    }

}
