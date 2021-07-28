package com.example.dependency_injection_android.models;

import android.util.Log;

import com.example.dependency_injection_android.MainActivity;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private String TAG = MainActivity.class.getSimpleName();

    @Inject
    public Car(Engine engine, Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }
    public void start(){
        Log.d(TAG,"Car is running..");
    }
}
