package Unit6;

public class FreightTransport extends TerrestrialTransport {
    private int carryingCapacity;

    public FreightTransport(String brand, double power, int maxSpeed, int weight, int fuelConsumption, int wheelCount, int carryingCapacity) {
        super.brand = brand;
        super.power = power;
        super.maxSpeed = maxSpeed;
        super.weight = weight;
        super.fuelConsumption = fuelConsumption;
        super.wheelCount = wheelCount;
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void info() {
        System.out.println( "Марка машины - " + brand +
                            " Мощность двигателя - " + power + " л.с." +
                            " Максимальная скорость - " + maxSpeed + " км/ч" +
                            " Масса автомобиля - " + weight + " кг." +
                            " Расход топлива - " + fuelConsumption + " л/100км" +
                            " Количество колёс - " + wheelCount +
                            " Грузоподъемность - " + carryingCapacity + " т.");
    }

    public void cargoCapacity(int weightOfCargo){
        if(weightOfCargo<=carryingCapacity){
            System.out.println("Машина загружена");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}
