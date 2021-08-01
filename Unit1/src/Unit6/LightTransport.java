package Unit6;

public class LightTransport extends TerrestrialTransport {
    private String carcase;
    private int numberOfPassengers;

    public LightTransport(String brand, double power, int maxSpeed, int weight, int fuelConsumption, int wheelCount, String carcase, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelConsumption);
        this.carcase = carcase;
        this.numberOfPassengers = numberOfPassengers;
    }

    double powerKW() {
        return power * 0.74;
    }

    @Override
    void info() {
        super.info();
        System.out.print(
                " Тип кузова - " + carcase +
                        " Кол-во пассажиров - " + numberOfPassengers +
                        " Мощность в киловаттах - " + powerKW() + " кВ"
        );
    }

    public void fuelСonsumption(double time) {
        double distance = time * maxSpeed;
        System.out.println();
        System.out.println("За время " + time + "ч," +
                "автомобиль " + brand +
                " двигаясь с максимальной скоростью " + maxSpeed +
                " км/ч проедет " + distance + " км  и израсходует " + consumableFuel(distance) + " литров топлива.)");
    }

    private double consumableFuel(double distance) {
        return (distance / 100) * fuelConsumption;
    }

    public static void main(String[] args) {
       Transport car1 = new LightTransport("BMW", 350, 280, 2700, 12, 4, "Coupe", 4);
        car1.info();
        ((LightTransport) car1).fuelСonsumption(3.5);


    }

}

