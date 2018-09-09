package com.example.demo.controller;


import com.example.demo.dao.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Log4j2
public class TestController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        log.info("post work -----------------------------------");
        log.info("student {}", student);
        studentService.addStudent(student);
        return student.toString() + "-----ок-----";
    }

    @GetMapping("/student")
    public List<Student> getAll() {
        return studentService.allStudent();
    }

    @GetMapping("/findByName/{name}")
    public List<Student> findByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/findById/{id}")
    public Optional<Student> findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @PostMapping("/deleteById/{id}")
    public List<Student> deleteById(@PathVariable int id) {
        studentService.deleteById(id);
        return studentService.allStudent();
    }

    @PostMapping("/deleteByName/{name}")
    public List<Student> deleteByName(@PathVariable String name) {
        studentService.deleteByName(name);
        return studentService.allStudent();
    }

    @GetMapping("findByAge/{age}")
    public List<Student> findByAge(@PathVariable int age) {
        return studentService.findByAge(age);
    }

    @GetMapping("findByCity/{city}")
    public List<Student> findByCity(@PathVariable String city) {
        return studentService.findByCity(city);
    }

    @GetMapping("findByAgeAndCity/{age}/{city}")
    public List<Student> findByAgeAndCity(@PathVariable int age, @PathVariable String city) {
        return studentService.findByAgeAndCity(age, city);
    }
}
