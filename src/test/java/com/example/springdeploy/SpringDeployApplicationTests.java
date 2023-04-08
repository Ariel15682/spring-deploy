package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	//Imprime las variables de entorno
	void contextLoads() {
		System.getenv().forEach(
				(key,value) -> System.out.println(key + " " + value)//funcion Lambda
		);
	}

}
