package com.example.dependency_injection_android.module;

import com.example.dependency_injection_android.models.DieselEngine;
import com.example.dependency_injection_android.models.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    private static final String TAG = "MainActivity";

    @Binds
    abstract public Engine providesEngine(DieselEngine dieselEngine) ;
}
