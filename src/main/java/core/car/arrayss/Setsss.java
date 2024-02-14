package core.car.arrayss;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setsss {
    public static void main(String[] args) {
        List<String> newCars = new ArrayList<String>(){{
             add("vaz");
             add("vaz");
             add("vaz");
             add("vaz1");
             add("uaz");
             add("gaz");
             add("kamaz");
        }};

        Set<String> cars = new HashSet<>(newCars);
        cars.add("vaz");
        cars.add("vaz");
        cars.add("uaz");
        cars.add("gaz");
        cars.add("kamaz");

        for (String car : cars) {
            if (car.equalsIgnoreCase("VaZ")) {
                System.out.println("OK");
                break;
            }
        }

        System.out.println(cars);
    }

}
