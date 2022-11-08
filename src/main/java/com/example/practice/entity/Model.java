package com.example.practice.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "practice")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String address;
    private String password;
}
