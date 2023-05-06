package com.kabelo.bugtracker.service;

import com.kabelo.bugtracker.dao.UserDao;
import com.kabelo.bugtracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }
}
