package demo.plan.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"demo.plan"})
@MapperScan("demo.*.dao")
public class Application {
	public static void main(String args[]){
		SpringApplication.run(Application.class, args);
	}
}
