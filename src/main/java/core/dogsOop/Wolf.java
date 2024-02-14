package core.dogsOop;

import java.util.Random;

public class Wolf extends Dog {
    @Override
    void search() {
        System.out.println("Волк охотится днем");
    }

    public void hunt() {
        System.out.println("Wolf is hunting");
    }

    public void run() {
        System.out.println("Wolf is running");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                search();
                break;
            case 1:
                run();
                break;
            case 2:
                hunt();
        }
    }
}
