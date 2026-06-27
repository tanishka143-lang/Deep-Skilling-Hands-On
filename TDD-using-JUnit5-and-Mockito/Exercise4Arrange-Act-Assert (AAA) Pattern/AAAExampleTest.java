package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AAAExampleTest {

    private Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAddition() {


        int a = 10;
        int b = 5;


        int result = calculator.add(a, b);


        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {


        int a = 10;
        int b = 5;


        int result = calculator.subtract(a, b);


        assertEquals(5, result);
    }

    @Test
    void testAdditionWithZero() {


        int a = 0;
        int b = 7;


        int result = calculator.add(a, b);


        assertEquals(7, result);
    }
}