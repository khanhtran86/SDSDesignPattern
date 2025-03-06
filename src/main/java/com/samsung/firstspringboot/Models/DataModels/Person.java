package com.samsung.firstspringboot.Models.DataModels;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity  /*Create entity - thuc the du lieu trog DB (table)*/
@Table(name = "Person") /*Ten cua table trong db map voi entity. Neu khong co, thi ten table trung vs entity */
public class Person {
    @Id /*Truong khoa chinh. Bat buoc moi entity can phai co*/
    @GeneratedValue(strategy = GenerationType.UUID)  /*Co che sinh du lieu*/
    private String id;
    @Column(name = "email", unique = true, nullable = false) /*Dinh nghia cac thuoc tinh cho Column + cac rang buoc*/
    private String email;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = true)
    private String lastName;
    private String avatar;

    @OneToOne
    @JoinColumn(name = "father_id")
    private Person father;

    @ManyToOne
    private Company company;
}
