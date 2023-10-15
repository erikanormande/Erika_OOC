/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author erika
 */
// Concrete class Bicycle implementing Drivable directly
class Bicycle implements Drivable {
    private float speed;
    private float direction;

    @Override
    public void accelerate(float speedIncrement) {
        // Bicycles can accelerate, but the implementation may vary
        // In this example, we'll increase the speed by a fixed amount
        this.speed += speedIncrement;
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

    @Override
    public String getMake() {
        return "Generic Bicycle";
    }

    @Override
    public String getType() {
        return "Bicycle";
    }
}
