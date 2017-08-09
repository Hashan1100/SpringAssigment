package com.example.services.repositories;

import com.example.services.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by hashan on 8/9/17.
 */
public interface StudentMongoRepository extends MongoRepository<Student, String> {
    <S extends Student> S save(S s);
    Iterable<Student> findAll(Iterable<String> iterable);
}
