package com.example.services.repositories;

import com.example.services.domain.Student;

/**
 * Created by hashan on 8/4/17.
 */
public class StudentRepository implements StudentRepositoryImpl  {

    public <S extends Student> S save(S s) {
        return null;
    }

    public <S extends Student> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    public void delete(Student student) {

    }

    public void delete(Iterable<? extends Student> iterable) {

    }

    public void deleteAll() {

    }

    public Iterable<Student> findAll(Iterable<String> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(String s) {

    }

    public Student findOne(String s) {
        return null;
    }

    public boolean exists(String s) {
        return false;
    }

    public Iterable<Student> findAll() {
        return null;
    }
}
