package com.timmy.service;

import com.timmy.dao.MyDao;
import com.timmy.domain.User;

public class MyService {

    private MyDao myDao;

    public MyDao getMyDao() {
        return myDao;
    }

    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }

    public void save(User user) {

        myDao.save(user);
    }
}
