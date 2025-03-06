package com.samsung.firstspringboot.Services;

import com.samsung.firstspringboot.Models.DataModels.Author;
import com.samsung.firstspringboot.Models.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    AuthorRepository repository;

    @Override
    public List<Author> getAllAuthor() {
        return repository.findAll();
    }

    @Override
    public void addAuthor(Author author) {
        repository.save(author);
    }
}
