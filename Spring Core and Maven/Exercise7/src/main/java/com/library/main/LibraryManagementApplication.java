package com.library.main;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service1 = (BookService) context.getBean("bookServiceConstructor");
        service1.displayBook();

        BookService service2 = (BookService) context.getBean("bookServiceSetter");
        service2.displayBook();
    }
}