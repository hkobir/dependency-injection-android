package com.example.dependency_injection_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dependency_injection_android.component.DaggerCarComponent;
import com.example.dependency_injection_android.models.Car;
import com.example.dependency_injection_android.component.CarComponent;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1; //variable or field injection

    @Inject
    Car car2; //variable or field injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startUp();
    }

    private void startUp() {
        //Using dagger automatic DI
//        CarComponent carComponent = DaggerCarComponent.create(); //without argument in module constructor
        CarComponent carComponent = ((DemoApplication) getApplication()).getCarComponent();


//        car = carComponent.getCar(); //constructor injection
        carComponent.inject(this);
        car1.start();
        car2.start();
    }
}