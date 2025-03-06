package com.samsung.firstspringboot.Models.DataModels;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    private Long id;

    private String title;

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name="author_id")) /*Define join table properties*/
    private List<Author> authors;
}
