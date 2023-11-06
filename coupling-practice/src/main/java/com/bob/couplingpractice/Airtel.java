package com.bob.couplingpractice;

public class Airtel {
     private Services services;

    public void setServices(Services services) {
        this.services = services;
    }
    public void airtelServices(){
        services.service();
    }
}
