package com.sambocheyrith.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.sambocheyrith.dto.request.RoleRequest;
import com.sambocheyrith.dto.response.RoleResponse;
import com.sambocheyrith.entity.Role;

public interface RoleService {

    RoleResponse createRole(RoleRequest request);
    RoleResponse getRoleById(Long id);
    RoleResponse updateRole(Long id, RoleRequest request);
    void deleteRole(Long id);
    List<Role> getAllRoles();
    Page<Role> getRolesWithPagination(int page, int size);

}