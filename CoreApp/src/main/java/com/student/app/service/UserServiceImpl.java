package com.student.app.service;

import com.example.services.domain.Student;
import com.example.services.repositories.StudentMongoRepositoryImpl;
import com.example.services.repositories.StudentRepository;
import com.example.services.repositories.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Map;

public class UserServiceImpl implements UserService
{

    @Autowired
    private StudentRepositoryImpl studentRepo;

    @Autowired
    private StudentMongoRepositoryImpl studentMongoRepo;

    public void insertStudentData(Student student){
        studentMongoRepo.save(student);
    }

    public ArrayList<Student> getAllStudents(){

        return (ArrayList<Student>) studentMongoRepo.findAll();
    }

    public boolean isValidStudent(String studentId)
    {
        if(Integer.parseInt(studentId) >= 1000 && Integer.parseInt(studentId) <= 10000){
            return true;
        } else {
            return false;
        }

    }
}
