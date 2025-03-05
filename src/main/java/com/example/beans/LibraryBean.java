package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LibraryBean {

    public LibraryBean() {
        System.out.println("LibraryAuditBean: Audit logging initialized. Ready to log library activities.");
    }
}