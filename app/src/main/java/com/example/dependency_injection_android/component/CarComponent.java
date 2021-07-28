package com.example.dependency_injection_android.component;

import com.example.dependency_injection_android.MainActivity;
import com.example.dependency_injection_android.models.Car;
import com.example.dependency_injection_android.models.DieselEngine;
import com.example.dependency_injection_android.module.DieselEngineModule;
import com.example.dependency_injection_android.module.PetrolEngineModule;
import com.example.dependency_injection_android.module.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    public Car getCar();

    public void inject(MainActivity mainActivity);
}
