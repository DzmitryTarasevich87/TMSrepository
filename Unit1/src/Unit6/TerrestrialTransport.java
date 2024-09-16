package Unit6;

public abstract class TerrestrialTransport extends Transport {
    int wheelCount;
    int fuelConsumption;
    @Override
    void info() {
        super.info();
        System.out.print( " Расход топлива - " + fuelConsumption + " л/100км" +
                " Количество колёс - " + wheelCount);
    }

    public TerrestrialTransport(double power, int maxSpeed, int weight, String brand, int wheelCount, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheelCount = wheelCount;
        this.fuelConsumption = fuelConsumption;

    }
}
