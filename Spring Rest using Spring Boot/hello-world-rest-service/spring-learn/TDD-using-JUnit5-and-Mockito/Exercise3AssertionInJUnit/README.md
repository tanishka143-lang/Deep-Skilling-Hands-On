# Exercise 3: Assertions in JUnit

## Objective

The aim of this exercise is to understand how different JUnit assertions work and how they are used to verify expected results in unit testing.

---

## Tools Used

- IntelliJ IDEA
- Maven Project
- JUnit 4

---

## Procedure

1. Used the existing Maven project configured with JUnit 4.
2. Created a test class named `AssertionsTest.java`.
3. Wrote test cases using different JUnit assertions.
4. Used values and objects to verify different conditions.
5. Ran the test using IntelliJ IDEA test runner.

---

## Code

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        int a = 2;
        int b = 3;
        int sum = a + b;

        String nullString = null;
        Object obj = new Object();

        assertEquals(5, sum);
        assertTrue(sum > 4);
        assertFalse(sum < 4);
        assertNull(nullString);
        assertNotNull(obj);
    }
}
```
