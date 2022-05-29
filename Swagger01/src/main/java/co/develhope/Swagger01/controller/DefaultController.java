package co.develhope.Swagger01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    public String getDefaultMessage(){
        return "Ciao! Vai al link: localhost:1234/swagger-ui/";
    }

}
