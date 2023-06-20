package com.microservices.email.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailRequest (

    @NotBlank
    String ownerRef,
    @NotBlank
    String emailFrom,
    @NotBlank
    @Email
    String emailTo,
    @NotBlank
    String subject,
    @NotBlank
     String text) {

}
