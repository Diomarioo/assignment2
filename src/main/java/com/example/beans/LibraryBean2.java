package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class LibraryBean2 {

    public LibraryBean2() {
        System.out.println("LibraryInitializationBean: Library system initialized and ready to use!");
    }
}