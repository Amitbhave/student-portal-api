package com.amit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amit.dto.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
