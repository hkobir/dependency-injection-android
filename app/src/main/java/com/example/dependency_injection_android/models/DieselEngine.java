package com.example.dependency_injection_android.models;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private static final String TAG = "MainActivity";

    @Inject
    public DieselEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "diesel engine started: ");
    }
}
