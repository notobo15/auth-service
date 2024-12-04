package com.devteria.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignupRequest {

    @Size(min = 4, message = "USERNAME_INVALID")
    private String username;

    @Size(min = 6, message = "INVALID_PASSWORD")
    private String password;

    private String confirmPassword;

    private String firstName;
    private String lastName;
}
