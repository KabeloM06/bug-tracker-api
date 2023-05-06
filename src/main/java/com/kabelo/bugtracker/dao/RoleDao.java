package com.kabelo.bugtracker.dao;

import com.kabelo.bugtracker.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
