package com.bobcodiz.datajpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "classRoll")
public class classModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Stud_ID")
    private Long studId;
    @Column(name = "First_Name",nullable = false)
    private String fName;
    @Column(name = "Last_Name",nullable = false)
    private String lName;
    @Column(name = "Gender",nullable = false)
    private String gender;
}
