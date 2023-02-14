package com.emma.inventoryservice;

import com.emma.inventoryservice.entities.Product;
import com.emma.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null, "Computer HP ENVY", 500, 67));
            productRepository.save(new Product(null, "Printer Epson", 200, 120));
            productRepository.save(new Product(null, "Mac Book Pro 07", 600, 45));
        };
    }

}
