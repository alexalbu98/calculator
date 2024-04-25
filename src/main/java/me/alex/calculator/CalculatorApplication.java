package me.alex.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the project that bootstraps the entire application.
 */
@SpringBootApplication
public class CalculatorApplication {

    /**
     * Main method.
     *
     * @param args The args received from command line.
     */
    public static void main(final String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

}
