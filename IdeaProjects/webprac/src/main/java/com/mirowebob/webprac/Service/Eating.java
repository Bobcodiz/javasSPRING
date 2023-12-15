package com.mirowebob.webprac.Service;

import org.springframework.stereotype.Component;

@Component
public class Eating {
    public String eatingSchedule(){
        System.out.println("EATING SCHEDULE");
        System.out.println("________________");
        return "We will release that schedule soon";
    }
}
