package com.sambocheyrith.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoleResponse {
    private Long id;
    private String code;
    private String name;
    private String description;
}
/// Map Entity to DTO
/// Map DTO to Entity