package com.bobTesting.BobTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /*System.out.println("config loaded");
        Airtel air = (Airtel) context.getBean("airtel");
        air.calling();
        air.data();
        System.out.println();
        System.out.println();
        Safaricom safari = context.getBean("safaricom",Safaricom.class);
        safari.data();
        safari.calling();*/
        Sim sim = context.getBean("sim",Sim.class);
        sim.calling();
        sim.data();

    }


}
