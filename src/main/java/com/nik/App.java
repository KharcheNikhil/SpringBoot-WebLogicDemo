package com.nik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.http.HttpMethod;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class App extends SpringBootServletInitializer implements WebApplicationInitializer
{
  
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @org.springframework.web.bind.annotation.RestController
    public static class RestController{
      
      @RequestMapping(method= RequestMethod.GET)
      public String sayHello(){
        return "hello";
      }
      
    }
}
