package Unit8.Task1.Trousers;

public class GucciTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Штаны Gucci надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Gucci сняты");
    }

    public GucciTrousers() {
    }
}
