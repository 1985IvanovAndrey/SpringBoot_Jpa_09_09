package com.example.demo.dao;

import com.example.demo.dao.entity.Student;
import com.example.demo.dao.entity.StudentTask;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class InitDataToDb {
    @Autowired
    private StudentService studentService;


    @PostConstruct
    private void init() {

        Student student1 = new Student("Mike", "Owen", 35, "Madrid", "Centr", "+38023255145");
        Student student2 = new Student("Cristiano", "Ronaldo", 35, "Madrid", "Real", "+38023555145");
        Student student3 = new Student("Andrey", "Shevchenko", 38, "Kiev", "Hrewatik", "+38022575145");
        Student student4 = new Student("David", "Bekcham", 39, "Manchester", "Burdi", "+38025455145");
        Student student5 = new Student("Leo", "Messi", 32, "Barselona", "Ronalda", "+38023257745");
        Student student6 = new Student("Billi", "Jons", 45, "London", "Centrix", "+38023252545");

        StudentTask studentTask1 = new StudentTask("first task", student1);
        StudentTask studentTask2 = new StudentTask("second task", student2);
        StudentTask studentTask3 = new StudentTask("three task", student3);
        StudentTask studentTask4 = new StudentTask("four task", student4);
        StudentTask studentTask5 = new StudentTask("five task", student5);
        StudentTask studentTask6 = new StudentTask("six task", student6);
        List<StudentTask> studentTaskList = new ArrayList<>();
        studentTaskList.add(studentTask1);
        studentTaskList.add(studentTask2);
        studentTaskList.add(studentTask3);
        studentTaskList.add(studentTask4);
        studentTaskList.add(studentTask5);
        studentTaskList.add(studentTask6);
//        student1.setTaskList(studentTaskList);
//        student2.setTaskList(studentTaskList);
//        student3.setTaskList(studentTaskList);
//        student4.setTaskList(studentTaskList);
//        student5.setTaskList(studentTaskList);
//        student6.setTaskList(studentTaskList);
        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.addStudent(student4);
        studentService.addStudent(student5);
        studentService.addStudent(student6);
    }
}
