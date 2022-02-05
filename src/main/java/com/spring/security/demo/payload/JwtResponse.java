package com.spring.security.demo.payload;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class JwtResponse {
    @Getter
    @Setter
    private String token;
    @Getter
    @Setter
    @JsonIgnore
    private Long id;

    @Getter
    @Setter
    @JsonIgnore
    private String username;

    @Getter
    @Setter
    @JsonIgnore
    private String email;

    @Getter
    @Setter

    private List<String> roles;

    @Getter
    private String type = "Bearer";


    public JwtResponse(String token) {
        this.token = token;
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.roles = roles;
    }
}
