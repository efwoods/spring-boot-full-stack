package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.demo.SpringBootFullStackApplication.*;

@SpringBootTest
class SpringBootFullStackApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void applicationContextTest(){
		main(new String[] {});
	}

}
