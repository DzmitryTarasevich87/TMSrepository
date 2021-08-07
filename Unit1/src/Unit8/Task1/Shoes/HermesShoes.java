package Unit8.Task1.Shoes;

public class HermesShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Обувь Hermes надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь Hermes снята");
    }

    public HermesShoes() {
    }
}
