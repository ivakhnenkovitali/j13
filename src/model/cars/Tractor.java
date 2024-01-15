package model.cars;

import model.people.IOwner;

public class Tractor extends Car implements ICargo{
    private int maxCargoWeight;

    public Tractor(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public Tractor(String model, int mileage, Color color, IOwner owner, int maxCargoWeight) {
        super(model, mileage, color, owner);
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tractor{");
        sb.append("maxCargoWeight=").append(maxCargoWeight);
        sb.append('}');
        return sb.toString();
    }
}
