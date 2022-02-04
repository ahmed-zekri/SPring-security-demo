package com.spring.security.demo.repositories;

import com.spring.security.demo.models.ERole;
import com.spring.security.demo.models.Role;
import com.spring.security.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);


}
