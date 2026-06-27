# Exercise 2: Implementing Dependency Injection

## Objective

To understand and implement Dependency Injection (DI) using the Spring Framework.

---

## Description

In this exercise, a simple library management system is created using Spring.
The `BookService` class depends on the `BookRepository` class, and this dependency is injected using Spring’s IoC container.

---

## Technologies Used

* Java
* Spring Core
* Maven
* IntelliJ IDEA

---

## Project Structure

```
Exercise2/
 ├── pom.xml
 ├── README.md
 └── src/
     └── main/
         ├── java/com/library/
         │   ├── repository/BookRepository.java
         │   ├── service/BookService.java
         │   └── main/MainApp.java
         └── resources/applicationContext.xml
```

---

## Steps Performed

1. Created a Maven project named Exercise2
2. Added Spring Core dependency in pom.xml
3. Created classes:

    * BookRepository
    * BookService
    * MainApp
4. Configured beans in applicationContext.xml
5. Injected BookRepository into BookService using setter injection
6. Ran the application using MainApp

---

## Key Concept

**Dependency Injection (DI):**
Spring automatically injects the required dependency (BookRepository) into BookService using setter method.

---

## Output

```
Book from Service: Spring Framework in Action
```

---



## Conclusion

This exercise demonstrates how Spring manages dependencies between classes using Dependency Injection and promotes loose coupling.

---
