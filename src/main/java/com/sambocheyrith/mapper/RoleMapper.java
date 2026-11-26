package com.sambocheyrith.mapper;

import org.springframework.stereotype.Component;

import com.sambocheyrith.dto.request.RoleRequest;
import com.sambocheyrith.dto.response.RoleResponse;
import com.sambocheyrith.entity.Role;
// Bean 
@Component 
public class RoleMapper {
    // 2method to map RoleRequest to Role entity
    // Map Entity to DTO
    public RoleResponse toResponse(Role role) {
        RoleResponse response = new RoleResponse();
        response.setId(role.getId());       
        response.setCode(role.getCode());
        response.setName(role.getName());
        response.setDescription(role.getDescription());
        return response;
    }

    // Map DTO to Entity
    public Role toEntity(RoleRequest request) {    
        Role role = new Role();
        role.setCode(request.getCode());
        role.setName(request.getName());
        role.setDescription(request.getDescription());
        return role;
    }

    public void updateEntity(RoleRequest request, Role role) {
        role.setCode(request.getCode());
        role.setName(request.getName());
        role.setDescription(request.getDescription());
    }

}
