# Exercise 2: Verifying Interactions using Mockito

## Overview

This exercise demonstrates how to verify method interactions using Mockito in unit testing.  
The main goal is to ensure that a specific method is called during execution with correct behavior.

---

## Objective

- Create a mock object using Mockito
- Call a method from the service class
- Verify that the expected method is invoked using Mockito `verify()`

---

## Tools Used

- Java
- JUnit 5
- Mockito
- IntelliJ IDEA

---

## Implementation Details

In this exercise:

- An `ExternalApi` interface is mocked using Mockito
- `MyService` class uses this mocked object
- The method `fetchData()` internally calls `getData()`
- Mockito `verify()` is used to confirm that `getData()` was called

---

## Key Code Logic

- Mock creation: `mock(ExternalApi.class)`
- Method call: `service.fetchData()`
- Verification: `verify(mockApi).getData()`

---

## How to Run

1. Open project in IntelliJ IDEA
2. Navigate to `MyServiceVerifyTest`
3. Right click and select Run
4. Test will pass if method interaction is correct

---

## Output

Test passes successfully if `ExternalApi.getData()` is called once during execution.

---

## Learning Outcome

- Understood how to verify method calls using Mockito
- Learned interaction testing instead of output testing
- Gained knowledge of mocking dependencies in unit tests

---

## Conclusion

This exercise helped in understanding how Mockito can be used to verify interactions between service and external dependencies without using real implementations.
