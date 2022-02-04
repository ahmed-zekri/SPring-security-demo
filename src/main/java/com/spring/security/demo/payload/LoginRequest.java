package com.spring.security.demo.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank
    @Getter
    @Setter
    private String username;

    @NotBlank
    @Getter
    @Setter
    private String password;
}
