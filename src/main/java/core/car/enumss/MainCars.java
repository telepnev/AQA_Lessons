package core.car.enumss;

public class MainCars {
    public static void main(String[] args) {
        CarWithEnum car1 = new CarWithEnum("BMW", TypeCar.SEDAN, "red", 2);
        if(!car1.getTypeCar().equals(TypeCar.SEDAN)) {
            System.out.println("error");
        } else {
            System.out.println("OK");
        }
    }
}
