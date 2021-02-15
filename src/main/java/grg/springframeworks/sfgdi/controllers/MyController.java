package grg.springframeworks.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller

public class MyController {

    public String getHello() {
        System.out.println("In MC.getHello");
        return "Hello_All";
    }
}
