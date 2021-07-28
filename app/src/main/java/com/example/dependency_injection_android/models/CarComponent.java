package com.example.dependency_injection_android.models;

import dagger.Component;

@Component
public interface CarComponent {
    public Car getCar();
}
