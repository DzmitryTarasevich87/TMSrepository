package Unit6;

public abstract class Transport {
    double power;
    int maxSpeed;
    int weight;
    String brand;

    public Transport(double power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    void info() {
        System.out.print("Марка машины - " + brand +
                " Мощность двигателя - " + power + " л.с." +
                " Максимальная скорость - " + maxSpeed + " км/ч" +
                " Масса автомобиля - " + weight + " кг.");
    }


}
