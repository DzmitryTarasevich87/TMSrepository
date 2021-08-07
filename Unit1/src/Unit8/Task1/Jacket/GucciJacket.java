package Unit8.Task1.Jacket;

public class GucciJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Пиджак Gucci надет");
    }

    @Override
    public void takeOff() {
        System.out.println("Пиджак Gucci снят");
    }

    public GucciJacket() {
    }
}
