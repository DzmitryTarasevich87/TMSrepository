package Unit6;

public class LightTransport extends TerrestrialTransport {
    private String carcase;
    private int numberOfPassengers;

    public LightTransport(String brand, double power, int maxSpeed, int weight, int fuelConsumption, int wheelCount, String carcase, int numberOfPassengers) {
        super.brand = brand;
        super.power = power;
        super.maxSpeed = maxSpeed;
        super.weight = weight;
        super.fuelConsumption = fuelConsumption;
        super.wheelCount = wheelCount;
        this.carcase = carcase;
        this.numberOfPassengers = numberOfPassengers;
    }

    double powerKW() {
        return power * 0.74;
    }

    @Override
    void info() {
        System.out.println( "Марка машины - " + brand +
                            " Мощность двигателя - " + power + " л.с." +
                            " Максимальная скорость - " + maxSpeed + " км/ч" +
                            " Масса автомобиля - " + weight + " кг." +
                            " Расход топлива - " + fuelConsumption + " л/100км" +
                            " Количество колёс - " + wheelCount +
                            " Тип кузова - " + carcase +
                            " Кол-во пассажиров - " + numberOfPassengers +
                            " Мощность в киловаттах - " + powerKW() + " кВ"
        );
    }

    void info2(double time) {
        double distance = time * maxSpeed;

        System.out.println("За время " + time + "ч," +
                "автомобиль " + brand +
                " двигаясь с максимальной скоростью " + maxSpeed +
                " км/ч проедет " + distance + " км  и израсходует " + consumableFuel(distance) + " литров топлива.)");
    }

    private double consumableFuel(double distance) {
        return (double) (distance / 100) * fuelConsumption;
    }

}

