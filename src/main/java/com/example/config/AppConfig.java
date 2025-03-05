package com.example.config;

import com.example.beans.LibraryBean2;
import com.example.beans.LibraryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public LibraryBean2 libraryInitializationBean() {
        return new LibraryBean2();
    }

    @Bean
    public LibraryBean libraryAuditBean() {
        return new LibraryBean();
    }
}