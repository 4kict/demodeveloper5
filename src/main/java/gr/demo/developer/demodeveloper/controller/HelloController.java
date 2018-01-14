package gr.demo.developer.demodeveloper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController

public class HelloController {
    @RequestMapping(path = "/hello")
    public String savePerson() {
        return "Hello! from HydroStation!";
    }

}
