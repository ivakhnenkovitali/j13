package model.cars;

import model.people.IOwner;

public class Truck extends Car implements ICargo{
    private double maxCargoWeinght;
    private int maxCapacity;

    public Truck(double maxCargoWeinght) {
        this.maxCargoWeinght = maxCargoWeinght;
    }

    public Truck(double maxCargoWeinght, int maxCapacity) {
        this.maxCargoWeinght = maxCargoWeinght;
        this.maxCapacity = maxCapacity;
    }

    public Truck(String model, int mileage, Color color, IOwner owner, double maxCargoWeinght, int maxCapacity) {
        super(model, mileage, color, owner);
        this.maxCargoWeinght = maxCargoWeinght;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeinght;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getMaxCargoWeinght() {
        return maxCargoWeinght;
    }

    public void setMaxCargoWeinght(double maxCargoWeinght) {
        this.maxCargoWeinght = maxCargoWeinght;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("color=").append(getColor());
        sb.append(", maxCapacity=").append(maxCapacity);
        sb.append(", maxCargoWeight=").append(getMaxCargoWeight());
        sb.append(", maxCargoWeinght=").append(maxCargoWeinght);
        sb.append(", mileage=").append(getMileage());
        sb.append(", model='").append(getModel()).append('\'');
        sb.append(", owner=").append(getOwner());
        sb.append('}');
        return sb.toString();
    }
}
