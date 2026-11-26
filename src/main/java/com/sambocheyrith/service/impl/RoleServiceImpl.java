package com.sambocheyrith.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sambocheyrith.dto.request.RoleRequest;
import com.sambocheyrith.dto.response.RoleResponse;
import com.sambocheyrith.entity.Role;
import com.sambocheyrith.mapper.RoleMapper;
import com.sambocheyrith.repository.RoleRepository;
import com.sambocheyrith.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    // Helper: find the entity or throw an error (used by getById, update, delete)
    private Role findRoleOrThrow(Long id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
    }

    @Override
    public RoleResponse createRole(RoleRequest request) {
        Role role = roleMapper.toEntity(request);
        Role entity = roleRepository.save(role);
        return roleMapper.toResponse(entity);
    }

    @Override
    public RoleResponse getRoleById(Long id) {
        return roleMapper.toResponse(findRoleOrThrow(id));
    }

    @Override
    public RoleResponse updateRole(Long id, RoleRequest request) {
        Role role = findRoleOrThrow(id);
        roleMapper.updateEntity(request, role);
        return roleMapper.toResponse(roleRepository.save(role));
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.delete(findRoleOrThrow(id));
    }

    @Override
    public List<Role> getAllRoles() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllRoles'");
    }

    @Override
    public Page<Role> getRolesWithPagination(int page, int size) {
        throw new UnsupportedOperationException("Unimplemented method 'getRolesWithPagination'");
    }
}