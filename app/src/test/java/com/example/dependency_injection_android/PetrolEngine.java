package com.example.dependency_injection_android;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}
