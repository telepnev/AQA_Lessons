package core.dogsOop;

import java.util.Random;

public class Kayot extends Dog{
    @Override
    void search() {
        System.out.println("Кайот охотится ночью");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                search();
                break;
            case 1:
                krusit();
                break;
            case 2:
                voice();
        }
    }

    public void voice() {
        System.out.println("Кайот воет ночью !!!!");
    }
    public void krusit() {
        System.out.println("Кайот ест падаль !!!!");
    }
}
