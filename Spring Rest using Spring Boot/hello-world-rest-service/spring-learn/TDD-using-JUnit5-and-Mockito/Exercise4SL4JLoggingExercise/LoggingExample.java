package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(org.example.LoggingExample.class);

    public static void main(String[] args) {

        // Example scenario values
        int errorValue = -1;
        int warningValue = 10;

        // ERROR LOG
        if (errorValue < 0) {
            logger.error("Error: Invalid value detected -> {}", errorValue);
        }

        // WARNING LOG
        if (warningValue < 20) {
            logger.warn("Warning: Value is getting low -> {}", warningValue);
        }

        // Direct logs (as required in task)
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
