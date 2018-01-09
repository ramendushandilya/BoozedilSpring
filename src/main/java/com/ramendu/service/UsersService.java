package com.ramendu.service;

import com.ramendu.data.dao.UsersDao;
import com.ramendu.data.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 1/8/2018
 *         Time: 6:54 PM
 */

@Service("usersService")
public class UsersService {
    private UsersDao usersDao;

    @Autowired
    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public boolean registerUser(Users users) {
        return usersDao.registerUser(users);
    }

    public boolean validate(String username, Users users) {
        return usersDao.validate(username, users);
    }
}