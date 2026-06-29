# Exercise 1 - Configuring a Basic Spring Application

## Objective

The goal of this exercise is to understand the basics of Spring Core using Maven and XML-based configuration. It demonstrates how Spring manages objects using Inversion of Control (IoC) and Dependency Injection (DI).

---

## Project Description

This project simulates a simple Library Management system where:

- BookRepository handles data-related logic
- BookService contains business logic
- Spring container manages object creation and dependency injection

---

## Technologies Used

- Java
- Spring Core (XML Configuration)
- Maven
- IntelliJ IDEA

---

## Concepts Covered

- Spring IoC Container
- Dependency Injection (Setter Injection)
- Bean Configuration using XML
- Maven Dependency Management

---

## Project Structure

- BookRepository → Provides book details
- BookService → Uses repository to fetch data
- MainApp → Loads Spring context and runs application
- applicationContext.xml → Defines Spring beans

---

## Output

When the application is executed, it prints the book details fetched from the repository using Spring-managed beans.

Example Output:
Spring Core Book: Clean Code Architecture

---

## How to Run

1. Import project in IntelliJ IDEA
2. Ensure Maven dependencies are loaded
3. Run MainApp.java
4. Output will be displayed in console

---

## Learning Outcome

Understood how Spring internally manages objects and dependencies using XML configuration instead of manual object creation.
