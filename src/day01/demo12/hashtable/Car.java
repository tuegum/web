package day01.demo12.hashtable;

import java.util.Objects;

public class Car {

    private String type;
    private String num;
    private int price;

    public Car() {
    }

    public Car(String type, String num, int price) {
        this.type = type;
        this.num = num;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return num == car.num &&
                price == car.price &&
                type.equals(car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, num, price);
    }
}
