package Unit6;

public abstract class AirTransport extends Transport{
    double wingspan;
    int minLengthRunwayStrip;

    public AirTransport(double power, int maxSpeed, int weight, String brand, double wingspan, int minLengthRunwayStrip) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthRunwayStrip = minLengthRunwayStrip;
    }

    @Override
    void info() {
        super.info();

        System.out.print(   " Размах крыльем - " + wingspan + " м." +
                " Минимальная длина взлётно-посадочной полосы - " + minLengthRunwayStrip);
    }
}
