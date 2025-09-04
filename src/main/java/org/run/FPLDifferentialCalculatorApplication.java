package org.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FPLDifferentialCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FPLDifferentialCalculatorApplication.class, args);
    }
}
