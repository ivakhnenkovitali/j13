import model.cars.*;
import model.people.Entity;
import model.people.IOwner;
import model.people.Person;

import javax.imageio.event.IIOWriteProgressListener;

public class Main {
    public static void main(String[] args) {

        IOwner[] owners = {
                new Person("HB1111111", "Vasya"),
                new Entity(1234567, "YURA & Co"),
                new Person("HP2222222", "Misha"),
                new Entity(9876, "Veseliy Denek")

        };

        CarList carList1 = new CarList();
        carList1.add(new Truck("BMW", 100000, Color.WHITE, owners[0], 5, 3));
        carList1.add(new Tractor("Belarus", 50000, Color.BLACK, owners[1], 3));
        carList1.add(new PassengerCar("Lada", 200000, Color.RED, owners[2], 5));
        carList1.add(new Truck("Opel", 300000, Color.RED, owners[2], 5, 3));
        carList1.add(new PassengerCar("Mer", 100, Color.WHITE, owners[2], 5));



        System.out.println("инфо о авто");
        carList1.showCars();
        System.out.println("инфо о первом в списке авто");
        System.out.println(carList1.getCarByIndex(0));

        System.out.println("список авто по владельцу");
        System.out.println(owners[2]);

        CarList carList2 = new CarList();
        carList2.addCars(carList1.getCarsByOwner(owners[2]));
        carList2.showCars();


        ICargo[] cargoCars1 = carList1.getCargoCars();
        for (ICargo cargo : cargoCars1) {
            System.out.println(cargo);

        }


    }
}
