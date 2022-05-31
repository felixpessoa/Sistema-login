package com.felixpessoa.security.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felixpessoa.security.domain.model.Role;
import com.felixpessoa.security.domain.model.enums.ERole;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Optional<Role> findByName(ERole name);
	
}
