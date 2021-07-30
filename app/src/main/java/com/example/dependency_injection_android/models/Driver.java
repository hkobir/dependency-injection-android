package com.example.dependency_injection_android.models;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton //only single instance will create every time
public class Driver {
    @Inject
    public Driver(){

    }
}
