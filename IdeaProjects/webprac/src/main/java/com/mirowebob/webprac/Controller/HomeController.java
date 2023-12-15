package com.mirowebob.webprac.Controller;

import com.mirowebob.webprac.Service.Eating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeController {
    //Field Annotation
    @Autowired
    private Eating eating;

    /*//constructor Injection
    @Autowired
    public HomeController(Eating eating) {
        this.eating = eating;
    }*/
  /*  @Autowired
    public void setEating(Eating eating) {
        this.eating = eating;
    }*/


    public String welcomeHome(){
        System.out.println("Welcome Home...");
        return eating.eatingSchedule();
    }
}
