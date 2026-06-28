# Spring Boot Hands-on 1: Create a Spring Web Project using Maven

##  Project Overview
This project is created as part of Cognizant Deep Skilling Hands-on exercises. The objective is to create a Spring Boot Web application using Maven and understand the project structure, dependencies, and execution flow.

The project is generated using Spring Initializr and imported into Eclipse IDE.

---

##  Technologies Used
- Java 21
- Spring Boot
- Spring Web
- Spring Boot DevTools
- Maven
- Eclipse IDE

---

##  Steps Followed to Create Project

1. Open Spring Initializr: https://start.spring.io/
2. Set:
   - Group: `com.cognizant`
   - Artifact: `spring-learn`
3. Add dependencies:
   - Spring Web
   - Spring Boot DevTools
4. Generate and download ZIP file
5. Extract project into local workspace
6. Import into Eclipse:
   File → Import → Maven → Existing Maven Projects
7. Build project using Maven
8. Run `SpringLearnApplication.java`

---

##  Project Structure

### src/main/java
Contains application source code including the main class.

### src/main/resources
Contains configuration files like `application.properties`.

### src/test/java
Contains test cases for application testing.

---

##  Main Class: SpringLearnApplication.java

This is the entry point of the Spring Boot application.

### Code:
```java
SpringApplication.run(SpringLearnApplication.class, args);