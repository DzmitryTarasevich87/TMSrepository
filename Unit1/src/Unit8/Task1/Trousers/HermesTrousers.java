package Unit8.Task1.Trousers;

public class HermesTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Штаны Hermes надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Hermes сняты");
    }

    public HermesTrousers() {
    }
}
