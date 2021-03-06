package net.sinou.sandbox.springboot.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Conveniently replacing following standard annotations: Configuration,
 * EnableAutoConfiguration and ComponentScan
 */
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
