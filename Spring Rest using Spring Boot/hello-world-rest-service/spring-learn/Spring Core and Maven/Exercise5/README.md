# Exercise 5: Configuring the Spring IoC Container

## Objective

The objective of this exercise is to configure the Spring IoC (Inversion of Control) container using an XML configuration file and manage dependencies between beans in a Library Management Application.

---

## Scenario

The Library Management Application requires centralized configuration for managing objects (beans) like BookService and BookRepository using Spring Framework.

---

## Technologies Used

- Java (JDK 8+)
- Spring Core (spring-context, spring-aop)
- Maven
- IntelliJ IDEA

---

## Project Structure

Exercise5/
│── src/
│ ├── main/
│ │ ├── java/com/library/
│ │ │ ├── repository/
│ │ │ │ └── BookRepository.java
│ │ │ ├── service/
│ │ │ │ └── BookService.java
│ │ │ └── main/
│ │ │ └── MainApp.java
│ │ └── resources/
│ │ └── applicationContext.xml
│── pom.xml

---

## Steps Performed

### 1. Created XML Configuration File

- Created `applicationContext.xml` inside `src/main/resources`
- Defined beans:
  - BookRepository
  - BookService

- Injected dependency using setter injection

---

### 2. Implemented BookRepository Class

- Contains method:
  - `getBook()`

- Returns book name

---

### 3. Implemented BookService Class

- Contains:
  - Reference to BookRepository
  - Setter method for dependency injection

- Method:
  - `displayBook()` prints book details

---

### 4. Configured Dependency Injection

- Used XML-based configuration
- BookService depends on BookRepository
- Injected using `<property>` tag

---

### 5. Created Main Application

- Loaded Spring container using:
  - ClassPathXmlApplicationContext

- Retrieved BookService bean
- Called method to display output

---

## How to Run

1. Open project in IntelliJ IDEA
2. Ensure Maven dependencies are loaded
3. Run `MainApp.java`

---

## ✅ Output

Book: Spring Framework in Action

---

## Key Concepts Learned

- Spring IoC Container
- XML-based configuration
- Dependency Injection (Setter Injection)
- Bean lifecycle management

---

## Conclusion

This exercise demonstrates how Spring manages object creation and dependency injection using XML configuration, making applications loosely coupled and easier to maintain.

---
