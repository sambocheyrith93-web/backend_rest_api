package com.sambocheyrith.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoleRequest {
    private String code;
    private String name;
    private String description;
}