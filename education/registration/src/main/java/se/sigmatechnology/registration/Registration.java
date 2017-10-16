package se.sigmatechnology.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Hello world!
 */
@SpringBootApplication
public class Registration {
    final static Logger logger = Logger.getLogger("Registration.class");

    public static void main(String[] args) {
        SpringApplication.run(Registration.class);
    }
}
