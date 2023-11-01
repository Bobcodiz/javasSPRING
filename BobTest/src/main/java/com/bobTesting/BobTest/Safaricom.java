package com.bobTesting.BobTest;

public class Safaricom implements Sim {

    @Override
    public void calling() {

        System.out.println("this is safaricom expensive calls");
    }

    @Override
    public void data() {
        System.out.println("this is safaricom make your own data");
    }
}
