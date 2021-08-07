package Unit8.Task1.Trousers;

public class FendiTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Штаны Fendi надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Fendi сняты");
    }

    public FendiTrousers() {
    }
}
