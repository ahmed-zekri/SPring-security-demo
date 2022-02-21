package com.spring.security.demo.controllers.testController;

import com.spring.security.demo.models.Movie;
import com.spring.security.demo.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
@AllArgsConstructor
public class TestController {
    MovieRepository movieRepository;

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/movies")
    @PreAuthorize("hasRole('USER')")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Content.";
    }

    @GetMapping("/devops")
    @PreAuthorize("hasRole('DEVOPS')")
    public String devopsAccess() {
        return "devops Content.";
    }
}