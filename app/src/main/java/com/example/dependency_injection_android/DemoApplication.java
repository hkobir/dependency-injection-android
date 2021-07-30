package com.example.dependency_injection_android;

import android.app.Application;

import com.example.dependency_injection_android.component.CarComponent;
import com.example.dependency_injection_android.component.DaggerCarComponent;

public class DemoApplication extends Application {
    CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        carComponent = DaggerCarComponent.builder()
                .horsePower(300) //with argument into builder in component
                .engineCapacity(1000)
                .build();
    }

    public CarComponent getCarComponent() {
        return carComponent;
    }
}
