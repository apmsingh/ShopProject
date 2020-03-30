package com.cs.config.screen.base;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.cs.controller.config.*")
public class ApplicationInitializer {
  
  public static void main(String[] args)
  {
    System.out.println("*************************** Initilaize Data***************\n\n\n");
    System.setProperty("server.servlet.context-path", "/shop");
    SpringApplication.run(ApplicationInitializer.class, args);
    System.out.println("******************* Done with initialization ***************\n\n\n");
  }
  
  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx)
  {
    return args -> {
      String[] beanNames = ctx.getBeanDefinitionNames();
      Arrays.sort(beanNames);
    };
  }
  
}