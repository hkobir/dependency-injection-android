package com.example.dependency_injection_android.component;

import com.example.dependency_injection_android.MainActivity;
import com.example.dependency_injection_android.models.Car;
import com.example.dependency_injection_android.models.DieselEngine;
import com.example.dependency_injection_android.models.PetrolEngine;
import com.example.dependency_injection_android.module.DieselEngineModule;
import com.example.dependency_injection_android.module.PetrolEngineModule;
import com.example.dependency_injection_android.module.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    public Car getCar();

    public void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }
}
