package com.student.app.service;

import java.sql.SQLException;

public interface UserService
{
    boolean isValidStudent(String studentId) throws SQLException;
}

