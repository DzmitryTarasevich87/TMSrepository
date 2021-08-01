package Unit6;

public class MilitaryTransport extends AirTransport {
    private boolean availabilityEjectionSystem;
    private int ammunition;

    double powerKW() {
        return power * 0.74;
    }

    public MilitaryTransport(String brand, double power, int maxSpeed, int weight, double wingspan, int minLengthRunwayStrip, boolean availabilityEjectionSystem, int ammunition) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthRunwayStrip);
        this.availabilityEjectionSystem = availabilityEjectionSystem;
        this.ammunition = ammunition;
    }


    @Override
    void info() {
        super.info();
        System.out.print(
                " Наличие системы катапультирования - " + availabilityEjectionSystem +
                        " Кол-во ракет на борту - " + ammunition
        );
    }

    void shot() {
        if (ammunition > 0) {
            System.out.println("Ракета пошла…");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void bailout() {
        if (availabilityEjectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
