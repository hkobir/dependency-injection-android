package com.example.dependency_injection_android.models;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private int horsePower;
    private int engineCapacity;
    private static final String TAG = "MainActivity";

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine started: with horsePower:engineCapacity " + horsePower + ":" + engineCapacity);
    }
}
