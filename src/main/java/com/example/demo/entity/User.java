package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @Column(name ="firstname")
    String firstName;

    @Column(name ="lastname")
    String lastName;
}
