package Unit8.Task1;


import Unit8.Task1.Jacket.FendiJacket;
import Unit8.Task1.Jacket.GucciJacket;
import Unit8.Task1.Jacket.HermesJacket;
import Unit8.Task1.Jacket.Jacket;
import Unit8.Task1.Shoes.FendiShoes;
import Unit8.Task1.Shoes.GucciShoes;
import Unit8.Task1.Shoes.HermesShoes;
import Unit8.Task1.Shoes.Shoes;
import Unit8.Task1.Trousers.FendiTrousers;
import Unit8.Task1.Trousers.GucciTrousers;
import Unit8.Task1.Trousers.HermesTrousers;
import Unit8.Task1.Trousers.Trousers;

public class Run {
    public static void main(String[] args) {
        Shoes gucciShoes = new GucciShoes();
        Shoes hermesShoes = new HermesShoes();
        Shoes fendiShoes = new FendiShoes();
        Trousers gucciTrousers = new GucciTrousers();
        Trousers hermesTrousers = new HermesTrousers();
        Trousers fendiTrousers = new FendiTrousers();
        Jacket gucciJacket = new GucciJacket();
        Jacket hermesJacket = new HermesJacket();
        Jacket fendiJacket = new FendiJacket();

        Person tom = new Person("Tom",gucciShoes,fendiTrousers,hermesJacket);
        tom.putOn();
        tom.takeOff();
    }
}
