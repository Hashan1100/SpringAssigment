package com.student.app.service;

public class UserServiceImpl implements UserService
{

    //private UserDao userDao;

    public void getUserDao()
    {

    }
/*
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }*/


    public boolean isValidStudent(String studentId)
    {
        if(Integer.parseInt(studentId) >= 1000 && Integer.parseInt(studentId) <= 10000){
            return true;
        } else {
            return false;
        }

    }

}
