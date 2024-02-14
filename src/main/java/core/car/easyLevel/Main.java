package core.car.easyLevel;

public class Main {
    public static void main(String[] args) {
        String name = "Evgeny";
        int age = 20;
        String replaceNumbers = "1112345119411";
        String startChar = "Ev";
        boolean isCharCorect = name.startsWith(startChar);

        String nameAndAge = String.format("My name is %s and my age %d", name, age);
        String newReplacedNumber = replaceNumbers.replace("1", "Y");

        System.out.println(newReplacedNumber);
        System.out.println(isCharCorect);
        System.out.println(nameAndAge);

        boolean is40 = age == 40 ? true : false;

        System.out.println(is40);
    }
}
