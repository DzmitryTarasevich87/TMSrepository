package Unit8.Task1.Jacket;

public class FendiJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Пиджак Fendi надет");
    }

    @Override
    public void takeOff() {
        System.out.println("Пиджак Fendi снят");
    }

    public FendiJacket() {
    }
}
