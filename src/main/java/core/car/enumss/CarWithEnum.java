package core.car.enumss;

public class CarWithEnum {
    private String carName;
    private TypeCar typeCar;
    private String color;
    private Integer doorCount;

    public CarWithEnum(String carName, TypeCar typeCar, String color, Integer doorCount) {
        this.carName = carName;
        this.typeCar = typeCar;
        this.color = color;
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarWithEnum{");
        sb.append("carName='").append(carName).append('\'');
        sb.append(", typeCar=").append(typeCar);
        sb.append(", color='").append(color).append('\'');
        sb.append(", doorCount=").append(doorCount);
        sb.append('}');
        return sb.toString();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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

    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }
}
