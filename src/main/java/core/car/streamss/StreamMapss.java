package core.car.streamss;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapss {
    public static void main(String[] args) {
        Map<String, Integer> coins = new HashMap<>(){{
            put("rub", 100);
            put("usd", 45);
            put("eur", 67);
            put("uaz", 489);
            put("zil", 12);
        }};
        System.out.println(coins);

        // Сортировка Хэш карты

        Map<String, Integer> revers = coins.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,
                (first, second) -> first, LinkedHashMap :: new));

        System.out.println("revers = " + revers);
    }
}
