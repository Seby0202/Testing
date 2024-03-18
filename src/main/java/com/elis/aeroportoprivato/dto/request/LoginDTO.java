package com.elis.aeroportoprivato.dto.request;

import jakarta.validation.constraints.Email;

public class LoginDTO {
    @Email
    private String email;
    private String password;
}
