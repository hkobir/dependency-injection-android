package com.example.dependency_injection_android;

public class OctaneEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Octane engine started");
    }
}
