package com.spring.security.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Getter
    @Setter
    private int episodes;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private LocalDate releaseDate;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "movies_charactes", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "character_id"))
    @Getter
    @Setter
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private java.util.List<Character> characters;

}
