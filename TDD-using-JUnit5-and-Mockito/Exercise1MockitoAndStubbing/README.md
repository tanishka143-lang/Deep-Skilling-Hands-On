# JUnit and Mockito Testing Exercise

## Project Overview

This project demonstrates unit testing in Java using Mockito.  
It includes basic testing concepts like assertions, mocking, and stubbing of external dependencies.

The main goal of this exercise is to test a service class without calling an actual external API by using Mockito.

---

## Tools and Technologies Used

- Java
- IntelliJ IDEA
- JUnit 4
- Mockito
- Maven

---

## Project Structure

src
└── test
└── java
└── org.example
├── ExternalApi.java
├── MyService.java
└── MyServiceTest.java

---

## Concepts Implemented

### 1. Unit Testing (JUnit)

JUnit is used to write and run test cases for individual methods.

### 2. Mocking (Mockito)

Mockito is used to create mock objects for external dependencies.

### 3. Stubbing

Methods of mocked objects are stubbed using `when().thenReturn()` to return predefined values.

### 4. Verification

Mockito `verify()` is used to check whether a method was called or not.

---

## Test Scenario

- ExternalApi is an external dependency.
- MyService depends on ExternalApi.
- Instead of calling the real API, Mockito mock is used.
- The mocked method returns "Mock Data".
- The service method fetchData() is tested using JUnit.

---

## How to Run the Project

1. Open the project in IntelliJ IDEA
2. Make sure Maven dependencies are loaded
3. Go to `MyServiceTest`
4. Right click and select Run
5. Test results will be shown in green if successful

---

## Output

All test cases pass successfully when Mockito mock is used correctly.

---

## Conclusion

This exercise helped in understanding how unit testing works in isolation using Mockito and JUnit.  
It also shows how external dependencies can be simulated for reliable testing.

---
