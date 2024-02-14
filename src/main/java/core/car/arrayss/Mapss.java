package core.car.arrayss;

import core.car.Car;

import java.util.HashMap;
import java.util.Map;

public class Mapss {
    public static void main(String[] args) {
        Map<String, Car> carMap = new HashMap<>();
        carMap.put("VAZ", new Car("Vaz", 10));
        carMap.put("GAZ", new Car("GAZ", 10));
        carMap.put("UAZ", new Car("UAZ", 10));

        System.out.println("carMap.get(\"VAZ\") = " + carMap.get("UAZ"));

        for (Map.Entry<String, Car> stringCarEntry : carMap.entrySet()) {
            if(stringCarEntry.getKey().equals("UAZ")) {
                carMap.replace("UAZ", new Car("UAZzzzzz", 1000));
            }
        }
        System.out.println("carMap.get(\"VAZ\") = " + carMap.get("UAZ"));
    }
}
