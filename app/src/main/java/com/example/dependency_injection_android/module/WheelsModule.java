package com.example.dependency_injection_android.module;

import android.util.Log;

import com.example.dependency_injection_android.models.Tyre;
import com.example.dependency_injection_android.models.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    private static final String TAG = "MainActivity";
    @Provides
    Tyre providesTyre(){
        Log.d(TAG, "providesTyre: ");
        return new Tyre();
    }
    @Provides
    Wheels providesWheels(Tyre tyre) {
        Log.d(TAG, "providesWheels: ");
        return new Wheels(tyre);
    }
}
