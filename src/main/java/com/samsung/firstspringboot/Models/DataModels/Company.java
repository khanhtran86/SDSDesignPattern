package com.samsung.firstspringboot.Models.DataModels;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "company")
    private List<Person> person;
}
