package com.spring.security.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Set;
@AllArgsConstructor
public class SignUpRequest {

    @NotBlank
    @Getter
    @Setter
    private String username;

    @NotBlank
    @Getter
    @Setter
    private String password;

    @NotBlank
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private Set<Integer> roles;
}
