package com.example.service;

import com.example.model.Book;
import com.example.model.User;
import com.example.repository.BookRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvancedLibraryService implements LibraryManagementService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookRepository.addBook(book);
        System.out.println("Book added using AdvancedLibraryService with additional logging.");
    }

    @Override
    public void addUser(String name, String email) {
        User user = new User(name, email);
        userRepository.addUser(user);
        System.out.println("User added using AdvancedLibraryService with additional logging.");
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}