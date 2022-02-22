package com.spring.security.demo.configuration;

import com.spring.security.demo.models.Character;
import com.spring.security.demo.models.ERole;
import com.spring.security.demo.models.Movie;
import com.spring.security.demo.models.Role;
import com.spring.security.demo.repositories.CharacterRepository;
import com.spring.security.demo.repositories.MovieRepository;
import com.spring.security.demo.repositories.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@AllArgsConstructor
public class Initializer implements CommandLineRunner {
    final RoleRepository roleRepository;
    final MovieRepository movieRepository;
    final CharacterRepository characterRepository;


    @Override
    public void run(String... args) {
        if (roleRepository.findByName(ERole.ROLE_USER).isEmpty())
            roleRepository.save(new Role(ERole.ROLE_USER));

        if (roleRepository.findByName(ERole.ROLE_ADMIN).isEmpty())
            roleRepository.save(new Role(ERole.ROLE_ADMIN));
        if (roleRepository.findByName(ERole.ROLE_MODERATOR).isEmpty())
            roleRepository.save(new Role(ERole.ROLE_MODERATOR));

        if (roleRepository.findByName(ERole.ROLE_DEVOPS).isEmpty())
            roleRepository.save(new Role(ERole.ROLE_DEVOPS));


        Character character = new Character();
        character.setName("John");
        character.setHeight("172");
        character.setMass("75");
        character.setSkinColor("dark");
        character.setHairColor("brown");
        if (characterRepository.findFirstByName("John").isEmpty())
            characterRepository.save(character);


        Character character2 = new Character();
        character2.setName("Ahmed");
        character2.setHeight("180");
        character2.setMass("80");
        character2.setSkinColor("dark");
        character2.setHairColor("black");
        if (characterRepository.findFirstByName("Ahmed").isEmpty())
            characterRepository.save(character2);

        List<Character> characters = new ArrayList<>();
        characters.add(character);
        characters.add(character2);

        Movie movie = new Movie();
        movie.setTitle("The Avengers");
        movie.setFavourite(true);
        movie.setCharacters(characters);
        movie.setRating(5.8f);

        movie.setReleaseDate(LocalDate.of(2012, 1, 1));
        movie.setEpisodes(55);


        Movie movie2 = new Movie();
        movie2.setTitle("The Avengers2");
        movie.setFavourite(true);
        movie.setCharacters(characters);
        movie.setRating(5.9f);

        movie.setReleaseDate(LocalDate.of(2013, 1, 1));
        movie.setEpisodes(25);


        if (movieRepository.findFirstByTitle(movie.getTitle()).isEmpty())
            movieRepository.save(movie);


    }

}

