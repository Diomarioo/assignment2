package com.example;

import com.example.beans.LibraryBean2;
import com.example.beans.LibraryBean;
import com.example.config.AppConfig;
import com.example.service.LibraryManagementService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryBean2 initializationBean = context.getBean(LibraryBean2.class);
        LibraryBean auditBean = context.getBean(LibraryBean.class);

        LibraryManagementService libraryService1 = context.getBean(LibraryManagementService.class);
        libraryService1.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        libraryService1.addUser("Anthony", "anthony@gmail.com");

        LibraryManagementService libraryService2 = context.getBean("advancedLibraryService", LibraryManagementService.class);
        libraryService2.addBook("1984", "George Orwell");
        libraryService2.addUser("John Doe", "johndoe@gmail.com");

        System.out.println("All books:");
        libraryService1.getAllBooks().forEach(System.out::println);

        System.out.println("All users:");
        libraryService1.getAllUsers().forEach(System.out::println);

        context.close();
    }
}