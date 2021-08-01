package Unit6;

public class FreightTransport extends TerrestrialTransport {
    private int carryingCapacity;

    double powerKW() {
        return power * 0.74;
    }

    public FreightTransport(String brand, double power, int maxSpeed, int weight, int fuelConsumption, int wheelCount, int carryingCapacity) {
        super(power,maxSpeed, weight, brand, wheelCount,fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void info() {
        super.info();
        System.out.print(" Грузоподъемность - " + carryingCapacity + " т.");
    }

    public void cargoCapacity(int weightOfCargo){
        if(weightOfCargo<=weight){
            System.out.println("Машина загружена");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}
