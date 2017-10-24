package demo.plan.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"demo.plan"})
public class main {
	public static void main(String args[]){
		SpringApplication.run(main.class, args);
	}
}
