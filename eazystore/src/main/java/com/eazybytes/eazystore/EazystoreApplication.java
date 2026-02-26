package com.eazybytes.eazystore;

import com.eazybytes.eazystore.entity.Product;
import com.eazybytes.eazystore.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = ProductRepository.class)
//@EntityScan(basePackageClasses = Product.class)
public class EazystoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazystoreApplication.class, args);
	}

}
