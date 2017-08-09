package com.student.app.service;

import com.example.services.domain.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserService
{
    boolean isValidStudent(String studentId) throws SQLException;
    void insertStudentData(Student student);
    ArrayList<Student> getAllStudents();
}

