# Exercise 4: AAA Pattern, Setup and Teardown in JUnit

## Objective

To organize test cases using the Arrange-Act-Assert (AAA) pattern and implement setup and teardown methods using JUnit.

---

## Description

In this exercise, unit test cases are written using JUnit to demonstrate proper test structuring. Each test follows the AAA pattern:

- Arrange: Prepare test data and objects
- Act: Execute the method under test
- Assert: Verify the expected output

Additionally, setup and teardown methods are used to initialize and clean up resources before and after each test execution.

---

## JUnit Annotations Used

- @BeforeEach → Executes before each test case to initialize objects
- @AfterEach → Executes after each test case to clean up resources
- @Test → Marks a method as a test case

---

## Example Class Used

Calculator class is used with basic arithmetic operations like addition and subtraction.

---

## Test Cases Implemented

1. testAddition()
   - Verifies addition functionality using AAA pattern

2. testSubtraction()
   - Verifies subtraction functionality using AAA pattern

3. testAdditionWithZero()
   - Checks addition with zero value

---

## Tools Used

- Java
- JUnit 5
- IntelliJ IDEA / Eclipse
- Maven

---

## Project Structure

src
├── main
│ └── java
│ └── org.example
│ └── Calculator.java
│
└── test
└── java
└── org.example
└── AAAExampleTest.java

---

## Outcome

This exercise helps in understanding:

- How to structure test cases properly using AAA pattern
- How to use setup and teardown methods in JUnit
- How to write clean and maintainable unit tests
