package gr.demo.developer.demodeveloper.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController("hello")
public class HelloController {

    public String savePerson() {
        return "Hello!@#";
    }

}
