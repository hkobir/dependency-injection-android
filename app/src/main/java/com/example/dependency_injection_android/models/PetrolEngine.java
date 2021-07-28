package com.example.dependency_injection_android.models;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = "MainActivity";
    @Inject
    public PetrolEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine started: ");
    }
}
