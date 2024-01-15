package model.cars;

public interface ICargo {
    double getMaxCargoWeight();
////// классы реализующие этот интерфейс необязаны переопределять default   метод
    default int getMaxCapacity() {
        return 0;
    }

}
