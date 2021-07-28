package com.example.dependency_injection_android;

public class Car {
    Engine engine;

    public Car(Engine engine) { //this called dependency injection
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
