package com.samsung.firstspringboot.Models.DataModels;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;

    @ManyToOne
    @JoinColumn(name = "person_id") /*Dinh nghia cac thuoc tinh cho foreign key*/
    private Person person; /*Bang 1*/
}
