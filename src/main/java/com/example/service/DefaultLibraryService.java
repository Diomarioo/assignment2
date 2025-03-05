package com.example.service;

import com.example.model.Book;
import com.example.model.User;
import com.example.repository.BookRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DefaultLibraryService implements LibraryManagementService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookRepository.addBook(book);
    }

    @Override
    public void addUser(String name, String email) {
        User user = new User(name, email);
        userRepository.addUser(user);
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