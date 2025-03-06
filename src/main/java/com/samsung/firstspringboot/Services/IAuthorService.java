package com.samsung.firstspringboot.Services;

import com.samsung.firstspringboot.Models.DataModels.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthor();

    void addAuthor(Author author);
}
