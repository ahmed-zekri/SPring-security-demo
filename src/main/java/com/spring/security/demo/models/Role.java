package com.spring.security.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Entity
@Table(name = "\"roles\"")
public class Role {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    ERole name;

    public Role(ERole name) {
        this.name = name;
    }
}
