package com.example.demofevsbe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "country")
    private String country;

    @Column(name = "classid")
    private int classid;

    @ManyToOne()
    @JoinColumn(name = "classid", insertable = false, updatable = false)
    private ClassEntity classes;
}
