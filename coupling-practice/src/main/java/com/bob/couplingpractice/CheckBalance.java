package com.bob.couplingpractice;

public class CheckBalance implements Services{
    @Override
    public void service() {
        System.out.println("Checking balance shows how much airtime remains");
    }
}
