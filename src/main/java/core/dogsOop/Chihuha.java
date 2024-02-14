package core.dogsOop;

import java.util.Random;

public class Chihuha extends Dog{
    @Override
    void search() {
        System.out.println("Чихуахуа просит еду на кухне");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                search();
                break;
            case 1:
                eat();
                break;
            case 2:
                sleep();
        }
    }

    void eat() {
        System.out.println("Чихуахуа жрет");
    }
    void sleep() {
        System.out.println("Чихуахуа спит");
    }
}
