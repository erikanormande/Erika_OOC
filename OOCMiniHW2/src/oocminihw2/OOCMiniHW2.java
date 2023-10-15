/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Erika Normande Gomes Queiroz - 2022436 
 */
// Drivable interface with abstract methods for vehicle behavior
interface Drivable {
    void accelerate(float speed);
    void brake();
    void turn(float angle);
    float getDirection();
    float getSpeed();
    String getMake();
    String getType();
}

// Abstract class implementing Drivable interface and providing basic vehicle information
abstract class AbstractVehicle implements Drivable {
    private String make;
    private String type;

    public AbstractVehicle(String make, String type) {
        this.make = make;
        this.type = type;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }
}


public class OOCMiniHW2 {
    // Main class to demonstrate the usage of the classes
    
    public static void main(String[] args) {
        // Example of Car instance
        Car car = new Car("Ferrari", "Portofino");
        car.accelerate(100);
        car.turn(30);
        System.out.println("Car: Make - " + car.getMake() + ", Type - " + car.getType() + ", Speed - " + car.getSpeed() + ", Direction - " + car.getDirection());

        // Example of Bicycle instance
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate(20);
        bicycle.turn(15);
        System.out.println("Bicycle: Make - " + bicycle.getMake() + ", Type - " + bicycle.getType() + ", Speed - " + bicycle.getSpeed() + ", Direction - " + bicycle.getDirection());
    }}