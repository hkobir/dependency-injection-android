package com.example.dependency_injection_android.module;

import com.example.dependency_injection_android.models.Engine;
import com.example.dependency_injection_android.models.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    private static final String TAG = "MainActivity";

    @Provides
    Engine providesEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }


}
