package com.student.app.delegate;

import com.student.app.service.UserService;

public class StudentDelegate
{
    private UserService userService;

    public UserService getUserService()
    {
        return this.userService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
}