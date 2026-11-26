package com.sambocheyrith.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter 
@Setter 
@ToString 
@Table(name = "role")
public class Role {

    private String code;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Instant createdAt;
     private Instant updatedAt;
     private Instant deletedAt;
     private String createdBy;
     private String updatedBy;
}
