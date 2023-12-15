package com.mirowebob.webprac.Controller;

import org.springframework.stereotype.Component;

@Component("homecoming")
public class Welcoming {
    public String comeHome(){
        return "Don't go back soon";
    }
}
