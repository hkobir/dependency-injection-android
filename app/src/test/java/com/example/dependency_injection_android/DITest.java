package com.example.dependency_injection_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class DITest {
    @Test
    public void launchEngine() {
        // demo code of Manual DI, Where car is dependent on engine object.

        Engine e1 = new PetrolEngine();
        Car car = new Car(e1); //object passed independently.
        car.start();

        Engine e2 = new OctaneEngine();
        Car car2 = new Car(e2);
        car2.start();
    }
}