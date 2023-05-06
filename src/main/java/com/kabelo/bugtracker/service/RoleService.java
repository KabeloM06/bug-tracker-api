package com.kabelo.bugtracker.service;

import com.kabelo.bugtracker.dao.RoleDao;
import com.kabelo.bugtracker.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
        return roleDao.save(role);
    }
}
