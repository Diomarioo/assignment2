package com.example.service;

import com.example.model.Book;
import com.example.model.User;

import java.util.List;

public interface LibraryManagementService {
    void addBook(String title, String author);
    void addUser(String name, String email);
    List<Book> getAllBooks();
    List<User> getAllUsers();
}