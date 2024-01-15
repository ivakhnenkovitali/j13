package model.cars;

import model.people.IOwner;

public abstract class Car {

    private String model;
    private int mileage;
    private Color color;
    private IOwner owner;

    public Car() {
    }

    public Car(String model, int mileage, Color color, IOwner owner) {
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public IOwner getOwner() {
        return owner;
    }

    public void setOwner(IOwner owner) {
        this.owner = owner;
    }



}
