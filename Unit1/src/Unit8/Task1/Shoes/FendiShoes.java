package Unit8.Task1.Shoes;

public class FendiShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Обувь Fendi надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь Fendi снята");
    }

    public FendiShoes() {
    }
}
