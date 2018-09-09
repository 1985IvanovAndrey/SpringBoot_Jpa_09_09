package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    public void deleteByName(String name);

    List<Student> findByAgeAndCity(int age, String city);

    List<Student> findByAge(int age);

    List<Student> findByCity(String city);
}
