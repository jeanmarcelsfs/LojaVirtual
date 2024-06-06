package com.jean.lojavirtual;

/**
LojaVirtual
@Author Jean Barboza - jean_marcel_sfs@hotmail.com
*
**/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.jean.lojavirtual.model")
public class LojaVirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
		System.out.println("Hello World!");
	}

}
