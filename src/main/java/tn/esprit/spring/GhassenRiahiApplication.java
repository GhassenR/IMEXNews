package tn.esprit.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAspectJAutoProxy
@EnableScheduling 
@SpringBootApplication
@EnableWebMvc   //@EnableSwagger2
public class GhassenRiahiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GhassenRiahiApplication.class, args);
	
	        
	}

}


