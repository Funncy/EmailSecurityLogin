package com.example.demo.service;

import com.example.demo.domain.Role;
import org.springframework.stereotype.Service;

public interface RoleService {
    public Role findByRole(String role);
}
