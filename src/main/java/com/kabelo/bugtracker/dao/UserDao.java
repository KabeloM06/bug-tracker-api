package com.kabelo.bugtracker.dao;

import com.kabelo.bugtracker.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
