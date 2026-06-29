# Exercise 1: Logging Error Messages and Warning Levels using SLF4J

---

## Objective

The objective of this exercise is to understand how logging works in Java applications using the SLF4J logging framework along with Logback implementation.

This exercise demonstrates how different log levels such as **ERROR** and **WARN** are used in real-world applications instead of using simple print statements.

---

## Tools and Technologies Used

- Java (JDK 8 or above)
- Maven
- SLF4J (Simple Logging Facade for Java)
- Logback Classic (Logging implementation)
- IntelliJ IDEA

## Project Description

In this exercise, a Java class named `LoggingExample` is created.

The program uses SLF4J Logger to log messages based on different conditions:

- ERROR logs are used when an invalid or critical condition occurs
- WARN logs are used when a value is in a risky or warning state
- Direct logging is also used to demonstrate basic log output

## Maven Dependencies

The following dependencies are added in the `pom.xml` file to enable logging functionality.

```xml

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>2.0.9</version>
</dependency>


<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.4.11</version>
</dependency>
```
