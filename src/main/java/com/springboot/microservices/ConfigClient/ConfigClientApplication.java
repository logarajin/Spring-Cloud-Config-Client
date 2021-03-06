package com.springboot.microservices.ConfigClient;

   import org.springframework.beans.factory.annotation.Value;
   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.SpringBootApplication;
   import org.springframework.cloud.context.config.annotation.RefreshScope;
   import org.springframework.web.bind.annotation.RequestMapping;
   import org.springframework.web.bind.annotation.RestController;

   @SpringBootApplication
   public class ConfigClientApplication {

       public static void main(String[] args) {
           SpringApplication.run(ConfigClientApplication.class, args);
       }
   }

   @RefreshScope
   @RestController
   class MessageRestController {

	   @Value("${welcome.message}")
       private String message;

       @RequestMapping("/")
       String getMessage() {
           return this.message;
       }
   }