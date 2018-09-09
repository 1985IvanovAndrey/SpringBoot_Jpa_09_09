package com.example.demo.service;

import com.example.demo.dao.entity.Student;
import com.example.demo.dao.entity.StudentTask;
import com.example.demo.dao.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.saveAndFlush(student);
    }
    public List<Student> allStudent() {
        return studentRepository.findAll();
    }
    public List<Student> findByName(String name){
        return studentRepository.findByName(name);
    }
    public List<Student> deleteById(int id){
        studentRepository.deleteById(id);
        return studentRepository.findAll();
    }
    public void deleteByName(String name){
       studentRepository.deleteByName(name);
    }
    public Optional<Student> findById(int id){
       return studentRepository.findById(id);
    }
    public List<Student>findByAgeAndCity(int age,String city){
        return studentRepository.findByAgeAndCity(age,city);
    }
    public List<Student>findByCity(String city){
        return studentRepository.findByCity(city);
    }
    public List<Student>findByAge(int age){
        return studentRepository.findByAge(age);
    }
}
