package com.example.dependency_injection_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dependency_injection_android.models.Car;
import com.example.dependency_injection_android.models.CarComponent;
import com.example.dependency_injection_android.models.DaggerCarComponent;

import dagger.internal.DaggerGenerated;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startUp();
    }

    private void startUp() {
        //Using dagger automatic DI
        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.start();
    }
}