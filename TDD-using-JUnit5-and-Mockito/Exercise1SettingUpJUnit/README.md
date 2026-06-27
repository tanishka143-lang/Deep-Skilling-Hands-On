# Exercise 1: Setting Up JUnit

##  Objective

The objective of this exercise is to set up JUnit in a Java project and execute a basic unit test successfully.

---

##  Tools & Technologies Used

* IntelliJ IDEA
* Maven
* JUnit

---

##  Project Setup Steps

1. Created a new Maven project in IntelliJ IDEA.
2. Configured the `pom.xml` file by adding JUnit dependency.
3. Created a test class named `SampleTest.java` inside:

   ```
   src/test/java/org/example/
   ```
4. Wrote a simple test case to verify addition logic.
5. Executed the test using IntelliJ.

---

##  Code Implementation

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }
}
```

---

##  Output

* The test case executed successfully.
* IntelliJ displayed a **green bar**, indicating all tests passed.

---


##  Conclusion

This exercise helped in understanding:

* How to set up JUnit in a Maven project
* How to write and execute a basic unit test
* Importance of automated testing in software development

---
