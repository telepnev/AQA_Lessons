package core.car;

import core.car.enumss.TypeCar;

import java.util.Objects;

public class Car {
    private String model;
    private int fuel;
    private String color;
    private TypeCar typeCar;
    private int dorCount;

    public int getDorCount() {
        return dorCount;
    }

    public void setDorCount(int dorCount) {
        this.dorCount = dorCount;
    }

    public Car(String model, int fuel, String color, TypeCar typeCar, int dorCount) {
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.typeCar = typeCar;
        this.dorCount = dorCount;
    }

    public Car(String model, int fuel, String color, TypeCar typeCar) {
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.typeCar = typeCar;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, int fuel, String color) {
        this.model = model;
        this.fuel = fuel;
        this.color = color;
    }

    public Car(String model, int fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public void goToRoad() {
        if (fuel > 10) {
            System.out.println("Машина может ехать, осталось топлива = " + fuel);
            fuel -= 5;
            System.out.println("  ------------   ");
        } else {
            System.out.println("Машина не может ехать");
            addFuel();
            System.out.println("Машина заправлена и может ехать");
        }
    }
    private void addFuel() {
        fuel += 20;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuel == car.fuel && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", fuel=").append(fuel);
        sb.append('}');
        return sb.toString();
    }
}
