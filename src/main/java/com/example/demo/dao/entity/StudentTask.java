package com.example.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_task")
@Data
@AllArgsConstructor
public class StudentTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    public Student student;
    @Column
    private String task;

    public StudentTask(String task, Student student) {
        this.task = task;
        this.student = student;
    }
}

