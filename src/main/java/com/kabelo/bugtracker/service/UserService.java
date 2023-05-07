package com.kabelo.bugtracker.service;

import com.kabelo.bugtracker.dao.RoleDao;
import com.kabelo.bugtracker.dao.UserDao;
import com.kabelo.bugtracker.entity.Role;
import com.kabelo.bugtracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admn role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for new user");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserEmail("admin@test.com");
        adminUser.setUserPassword("admin@pass1");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        userDao.save(adminUser);

        User user = new User();
        user.setUserFirstName("user");
        user.setUserLastName("user");
        user.setUserName("user123");
        user.setUserEmail("user@test.com");
        user.setUserPassword("user@pass1");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        userDao.save(user);
    }
}
