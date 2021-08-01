package Unit6;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    double powerKW() {
        return power * 0.74;
    }

    public CivilTransport(String brand, double power, int maxSpeed, int weight, double wingspan, int minLengthRunwayStrip, int numberOfPassengers, boolean businessClassAvailability) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthRunwayStrip);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    @Override
    void info() {
        super.info();
        System.out.print(
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
