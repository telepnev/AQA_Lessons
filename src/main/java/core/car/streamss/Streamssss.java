package core.car.streamss;

import core.car.Car;
import core.car.enumss.TypeCar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamssss {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>() {{
            add(new Car("Vaz", 10, "RED1", TypeCar.CROSSOVER, 2));
            add(new Car("BMX", 20, "RED2", TypeCar.PICKUP, 3));
            add(new Car("KAMAZ", 110, "Green", TypeCar.GRUZOVIK, 4));
            add(new Car("KRAZ", 130, "Green", TypeCar.GRUZOVIK, 6));
            add(new Car("UAZ", 40, "Black", TypeCar.GRUZOVIK, 2));
        }};



//        Optional<Car> superCar = car.stream().filter(c -> c.getColor().equals("RED"))
//                .findFirst()
//                        .orElseThrow(()-> new IllegalStateException("No RED color found"));

//         car.stream().filter(c -> c.getColor().equals("RED"))
//                .findFirst().orElseThrow(()-> new IllegalStateException("No RED color found"));


        List<String> onlyGreenCar = car.stream().
                filter(c -> c.getColor().equals("Green")).
                map(Car::getModel).
                toList();

        System.out.println("onlyGreenCar = " + onlyGreenCar);

        List<String> onlyTwoDors = car.stream().filter(c -> c.getDorCount() == 2)
                .map(Car::getModel)
                .collect(Collectors.toList());
        System.out.println("onlyTwoDors = " + onlyTwoDors);


        long myCars = car.stream().filter(c -> c.getColor().equals("RED"))
                        .count();
        boolean isNotNull = myCars != 0;

        if (isNotNull != true) {
            System.out.println("Список пуст!!!");
        }

        System.out.println("myCars = " + myCars);

    }
}
