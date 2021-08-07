package Unit8.Task1.Shoes;

public class GucciShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Обувь Gucci надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь Gucci снята");
    }

    public GucciShoes() {
    }
}
