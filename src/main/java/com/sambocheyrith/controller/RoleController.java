package com.sambocheyrith.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sambocheyrith.dto.request.RoleRequest;
import com.sambocheyrith.dto.response.RoleResponse;
import com.sambocheyrith.service.RoleService;

@RestController
@RequestMapping("api/v1/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping()
    public RoleResponse postMethodName(@RequestBody RoleRequest request) {
        return roleService.createRole(request);
    }

    @GetMapping("{id}")
    public RoleResponse getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    @PutMapping("{id}")
    public RoleResponse update(@PathVariable Long id, @RequestBody RoleRequest request) {
        return roleService.updateRole(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        roleService.deleteRole(id);
    }

}