package model.cars;

import model.people.IOwner;

import java.util.Arrays;

public class CarList {
    private static final int INITIAL_SIZE = 6;
    Car[] cars = new Car[INITIAL_SIZE];
    private int currentIndex = 0;

    public void add(Car car) {
        if (car != null) {
            if (currentIndex == cars.length) {
                cars = Arrays.copyOf(cars, cars.length * 3 / 2 + 1);

            }
            cars[currentIndex++] = car;

        }
    }

    public void addCars(Car... addCars) {
        for (Car addCar : addCars) {
            add(addCar);
        }
    }

    public void showCars() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(cars[i]);
        }
    }

    public boolean isValidIndex(int index) {
        return index >= 0 && index < currentIndex;


    }

    public Car getCarByIndex(int index) {
        Car car = null;
        if (isValidIndex(index)) {
            car = cars[index];
        }
        return car;
    }

    public Car[] getCarsByOwner(IOwner owner) {
        int j = 0;
        Car[] carsByOwner = new Car[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            if (cars[i].getOwner().equals(owner)) {
                carsByOwner[j++] = cars[i];


            }
        }
        carsByOwner = Arrays.copyOf(carsByOwner, j);
        return carsByOwner;
    }

    public ICargo[] getCargoCars(){
        ICargo[] cargoCars = new ICargo[currentIndex];
        int j = 0;
        for (int i = 0; i < currentIndex; i++){
            if (cars[i] instanceof ICargo){
                cargoCars[j++]= (ICargo) cars[i];
            }
        }
        cargoCars = Arrays.copyOf(cargoCars, j);
        return cargoCars;

    }
}
