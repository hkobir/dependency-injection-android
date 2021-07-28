package com.example.dependency_injection_android.models;

import android.util.Log;

import com.example.dependency_injection_android.MainActivity;

import javax.inject.Inject;

public class Wheels {
    private String TAG = MainActivity.class.getSimpleName();
    private Tyre tyre;

    public Wheels(Tyre tyre) {
        this.tyre = tyre;
    }

    public void move() {
        Log.d(TAG, "Wheels are moving..");
    }
}
