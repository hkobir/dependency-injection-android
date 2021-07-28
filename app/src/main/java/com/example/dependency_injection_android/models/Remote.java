package com.example.dependency_injection_android.models;

import javax.inject.Inject;

public class Remote {
    Car car;
    @Inject
    public Remote(){

    }
    public void setCar(Car car){
        this.car = car;
    }
}
