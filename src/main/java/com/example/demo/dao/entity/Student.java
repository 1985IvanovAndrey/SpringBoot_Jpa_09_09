package com.example.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surName;
    @Column
    private int age;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private String telefone;
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
//    public List<StudentTask> taskList;

    public Student(String name, String surName, int age, String city, String street, String telefone) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
        this.street = street;
        this.telefone = telefone;
    }

    public Student() {
    }
}
