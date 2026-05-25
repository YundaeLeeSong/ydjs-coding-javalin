package practice.java.j;

/**
 * Start Lab Challenge - Vehicle
 */
public class Vehicle {
    int currentSpeed;
    String make;
    String model;

    int accelerate() {
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    String honk() {
        return "HONNNK";
    }
}
