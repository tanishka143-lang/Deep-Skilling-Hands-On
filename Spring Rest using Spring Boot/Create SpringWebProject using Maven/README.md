### Spring Boot Hands-on 1: Create a Spring Web Project using Maven

## Project Overview

This project is created as part of Cognizant Deep Skilling Hands-on exercises. The objective is to create a Spring Boot Web application using Maven and understand the project structure, dependencies, and execution flow.

The project is generated using Spring Initializr and imported into Eclipse IDE.

## Technologies Used

Java 21
Spring Boot
Spring Web
Spring Boot DevTools
Maven
Eclipse IDE

## Steps Followed to Create Project

Open Spring Initializr: https://start.spring.io/

Set:
Group: com.cognizant
Artifact: spring-learn
Add dependencies:
Spring Web
Spring Boot DevTools

Generated and downloaded ZIP file

Extract project into local workspace

Import into Eclipse: File → Import → Maven → Existing Maven Projects

Build project using Maven

Run SpringLearnApplication.java

## Project Structure

src/main/java
Contains application source code including the main class.

src/main/resources
Contains configuration files like application.properties.

src/test/java
Contains test cases for application testing.

Main Class: SpringLearnApplication.java
This is the entry point of the Spring Boot application.

Code:
SpringApplication.run(SpringLearnApplication.class, args);
