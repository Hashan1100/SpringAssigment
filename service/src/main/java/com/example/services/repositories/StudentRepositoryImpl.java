package com.example.services.repositories;

import com.example.services.domain.Student;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by hashan on 8/4/17.
 */
public interface StudentRepositoryImpl extends CrudRepository<Student, String> {
    <S extends Student> S save(S s);
    void delete(Student student);
    void deleteAll();
    Iterable<Student> findAll(Iterable<String> iterable);
    Student findOne(String s);
}
