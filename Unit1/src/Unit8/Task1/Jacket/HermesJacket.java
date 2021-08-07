package Unit8.Task1.Jacket;

public class HermesJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Пиджак Hermes надет");
    }

    @Override
    public void takeOff() {
        System.out.println("Пиджак Hermes снят");
    }

    public HermesJacket() {
    }
}
