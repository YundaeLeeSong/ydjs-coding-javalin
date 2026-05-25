
// There is no need to edit this file.

public class Vehicle {
    int currentSpeed;
    String make;
    String model;

    int accelerate(){
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    String honk(){
        return "HONNNK";
    }

}
