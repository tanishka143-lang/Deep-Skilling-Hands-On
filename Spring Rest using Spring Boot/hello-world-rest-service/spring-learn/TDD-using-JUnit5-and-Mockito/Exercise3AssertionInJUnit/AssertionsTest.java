package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Arrange
        int a = 2;
        int b = 3;
        int sum = a + b;
        String nullString = null;
        Object object = new Object();

        assertEquals(5, sum, "Sum should be equal to 5");

        assertTrue(sum > 4, "Sum should be greater than 4");

        assertFalse(sum < 4, "Sum should not be less than 4");

        assertNull(nullString, "String should be null");

        assertNotNull(object, "Object should not be null");
    }
}