package Unit10;

import java.sql.SQLOutput;
import java.util.Random;

public class Car {

    private String brand;
    private int speed;
    private int cost;

    public Car() {
    }

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void start() throws StartException {

        if (new Random().nextInt(20) % 2 == 0) {
            throw new StartException("Не удалось завести машину");
        } else {
            System.out.println(brand + " завелась");
        }
    }
}

