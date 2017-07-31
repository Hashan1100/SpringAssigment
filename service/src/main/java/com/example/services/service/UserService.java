package com.example.services.service;

import java.sql.SQLException;

public interface UserService
{
    boolean isValidStudent(String studentId) throws SQLException;
}

