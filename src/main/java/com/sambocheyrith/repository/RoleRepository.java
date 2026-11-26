package com.sambocheyrith.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sambocheyrith.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
 
}