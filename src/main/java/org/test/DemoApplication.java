package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Configuration
@ComponentScan
@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        logger.info("Application Started");
        
    }
}


@RestController
class GreetingController {
	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
	
	@RequestMapping("/")
    public String index() {
		logger.info("Incoming index request");
		
        return "Greetings from Spring Boot!";
    }
	
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name)  {
    	
    	
    	logger.info("Incoming request : " + name );
    	return "Hello, " + name + "!";
        
        
    }
}