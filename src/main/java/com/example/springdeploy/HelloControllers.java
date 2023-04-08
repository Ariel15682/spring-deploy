package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    //Value permite inyectar una propiedad que tenemos en el fichero application-dev.properties, solo sale por consola
    @Value("${app.message}")
    String message;

    //@Value("${app.varexample}")
    //String username;

    @GetMapping("/hola")
    public String saludo(){
        System.out.println(message); //se leen en consola luego de ejecutar postman
        //System.out.println(username);
        return "Hola, buenos dias desde Spring!";
    }

}