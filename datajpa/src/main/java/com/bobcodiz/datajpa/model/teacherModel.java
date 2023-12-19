package com.bobcodiz.datajpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Teacher")
public class teacherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "First_Name",nullable = false)
    private String fName;
    @Column(name = "Last_Name",nullable = false)
    private String lName;
    @Column(name = "Subject",nullable = false)
    private String subject;
}
