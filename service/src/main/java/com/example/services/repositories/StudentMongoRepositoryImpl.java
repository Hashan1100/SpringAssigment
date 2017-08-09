package com.example.services.repositories;

import com.example.services.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * Created by hashan on 8/9/17.
 */
public class StudentMongoRepositoryImpl implements StudentMongoRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public <S extends Student> S save(S s)
    {
        mongoTemplate.save(s, "Student");
        return s;
    }

    public Student findOne(String s) {
        return null;
    }

    public boolean exists(String s) {
        return false;
    }

    public Iterable<Student> findAll(Iterable<String> iterable)
    {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(String s) {

    }

    public void delete(Student student) {

    }

    public void delete(Iterable<? extends Student> iterable) {

    }

    public void deleteAll() {

    }


    public <S extends Student> List<S> save(Iterable<S> iterable) {
        return null;
    }

    public List<Student> findAll() {
        return mongoTemplate.findAll(Student.class, "Student");
    }

    public List<Student> findAll(Sort sort) {
        return null;
    }

    public Page<Student> findAll(Pageable pageable) {
        return null;
    }
}
