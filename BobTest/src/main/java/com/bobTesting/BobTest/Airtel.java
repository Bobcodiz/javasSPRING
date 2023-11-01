package com.bobTesting.BobTest;

public class Airtel implements Sim {



    @Override
    public void calling() {
        System.out.println("this is airtel calls\n" +
                "Airtel has very good minute deals");
    }

    @Override
    public void data() {
        System.out.println("this is airtel data");
    }
}
