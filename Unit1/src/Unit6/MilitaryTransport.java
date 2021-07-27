package Unit6;

public class MilitaryTransport extends AirTransport {
    private boolean availabilityEjectionSystem;
    private int ammunition;

    public MilitaryTransport(String brand, double power, int maxSpeed, int weight, double wingspan, int minLengthRunwayStrip, boolean availabilityEjectionSystem, int ammunition ) {
        super.brand = brand;
        super.power = power;
        super.maxSpeed = maxSpeed;
        super.weight = weight;
        super.wingspan = wingspan;
        super.minLengthRunwayStrip = minLengthRunwayStrip;
        this.availabilityEjectionSystem = availabilityEjectionSystem;
        this.ammunition = ammunition;
    }


    @Override
    void info() {
        System.out.println( "Марка машины - " + brand +
                            " Мощность двигателя - " + power + " л.с." +
                            " Максимальная скорость - " + maxSpeed + " км/ч" +
                            " Масса машины - " + weight + " кг." +
                            " Размах крыльем - " + wingspan + " м." +
                            " Минимальная длина взлётно-посадочной полосы - " + minLengthRunwayStrip +
                            " Наличие системы катапультирования - "+availabilityEjectionSystem+
                            " Кол-во ракет на борту - "+ammunition
        );
    }

    void shot(){
        if(ammunition>0){
            System.out.println("Ракета пошла…");
        }else{
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    void bailout(){
        if(availabilityEjectionSystem){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }
}
