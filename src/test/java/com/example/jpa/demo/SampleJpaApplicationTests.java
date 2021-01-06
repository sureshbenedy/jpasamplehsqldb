package com.example.jpa.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleJpaApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(String.format("Environment Value received is : %s",System.getProperty("CHOICE")));
	}

}
