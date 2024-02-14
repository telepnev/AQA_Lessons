package core.dogsOop;

import java.util.*;

public class MainDogs {
    private static Random random = new Random();
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            dogList.add(getRandomDog());
        }

        for (int i = 0; i < 365; i++) {
            int randomIndex = random.nextInt(dogList.size());
            Dog temp = dogList.get(randomIndex);
            temp.randomAction();

            if (i % 30 == 0) {
                dogList.add(getRandomDog());
            }
        }
        System.out.println(dogList.size());

        Map<String, Integer> animals = new HashMap<>();
        for (Dog dog : dogList) {
            String className = dog.getClass().getSimpleName();
            if(animals.containsKey(className)) {
                int countName = animals.get(className);
                animals.put(className, countName + 1);
            }else {
                animals.put(className, 1);
            }
        }
        for (String clasName : animals.keySet()) {
            int count = animals.get(clasName);
            System.out.println(clasName + " : " + count);
        }
    }

    public static Dog getRandomDog() {
        int randomNumber = random.nextInt(3);
        Dog tempDog = null;

        switch (randomNumber) {
            case 0:
                tempDog = new Kayot();
                break;
            case 1:
                tempDog = new Wolf();
                break;
            case 2:
                tempDog = new Chihuha();
                break;
        }
        return tempDog;
    }
}
