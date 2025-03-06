package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Models.DataModels.Author;
import com.samsung.firstspringboot.Services.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    IAuthorService authorService;
    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthor()
    {
        List<Author> lstAuthor = authorService.getAllAuthor();
        return ResponseEntity.ok(lstAuthor);
    }

    @GetMapping("/sample")
    public ResponseEntity sampleAuthor()
    {
        Author author = Author.builder().name("Samsung Author").build();
        authorService.addAuthor(author);
        return ResponseEntity.ok("saved");
    }
}
