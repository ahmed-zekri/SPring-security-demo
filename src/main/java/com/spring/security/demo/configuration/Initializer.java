package com.spring.security.demo.configuration;

import com.spring.security.demo.models.ERole;
import com.spring.security.demo.models.Role;
import com.spring.security.demo.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer implements CommandLineRunner {
    final RoleRepository roleRepository;


    public Initializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

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
    }

}

