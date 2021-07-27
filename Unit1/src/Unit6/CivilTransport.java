package Unit6;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    public CivilTransport(String brand, double power, int maxSpeed, int weight, double wingspan, int minLengthRunwayStrip, int numberOfPassengers, boolean businessClassAvailability) {
        super.brand = brand;
        super.power = power;
        super.maxSpeed = maxSpeed;
        super.weight = weight;
        super.wingspan = wingspan;
        super.minLengthRunwayStrip = minLengthRunwayStrip;
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    @Override
    void info() {
        System.out.println( "Марка машины - " + brand +
                            " Мощность двигателя - " + power + " л.с." +
                            " Максимальная скорость - " + maxSpeed + " км/ч" +
                            " Масса машины - " + weight + " кг." +
                            " Размах крыльем - " + wingspan + " м." +
                            " Минимальная длина взлётно-посадочной полосы - " + minLengthRunwayStrip +
                            " Пассажировместимость - " + numberOfPassengers +
                            " Наличие бизнесс класса - " + businessClassAvailability
        );
    }

    public void passengerCapacity(int amount) {
        if (amount <= numberOfPassengers) {
            System.out.println("Пассажиры на борту");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
