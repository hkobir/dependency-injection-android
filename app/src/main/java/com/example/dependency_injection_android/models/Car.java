package com.example.dependency_injection_android.models;

import android.util.Log;

import com.example.dependency_injection_android.MainActivity;

import javax.inject.Inject;

public class Car {
    @Inject    //field inject
    Wheels wheels;
    Engine engine;


    private String TAG = MainActivity.class.getSimpleName();

    @Inject
    public Car(Engine engine) {   //constructor inject
        this.engine = engine;
        Log.d(TAG, "Car Constructor");
    }

    @Inject
    public void passCarToRemote(Remote remote) {   //method DI
        Log.d(TAG, "Car is passing to remote");
        remote.setCar(this);
    }

    public void start() {
        engine.start();
        wheels.move();
        Log.d(TAG, "Car is running..");
    }
}
