/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author erika
 */
// Concrete class Car extending AbstractVehicle
class Car extends AbstractVehicle {
    private float speed;
    private float direction;

    public Car(String make, String type) {
        super(make, type);
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }
}