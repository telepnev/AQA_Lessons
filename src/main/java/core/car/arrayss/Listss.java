package core.car.arrayss;

import core.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Listss {
    public static void main(String[] args) {
        List<Car> cars = getListCars();
        List<Car> newCars = new ArrayList<>();

        for (Car car : cars) {
            if(car.getFuel() > 20) {
                newCars.add(car);
            }
        }
        System.out.println(newCars);
    }

    private static List<Car> getListCars() {
        List<Car> car = new ArrayList<>() {{
            add(new Car("Vaz", 10));
            add(new Car("BMX", 20));
            add(new Car("KAMAZ", 110));
            add(new Car("KRAZ", 130));
            add(new Car("UAZ", 40));
        }};
        return car;
    }
}
