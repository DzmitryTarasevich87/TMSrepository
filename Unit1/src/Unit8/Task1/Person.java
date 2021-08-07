package Unit8.Task1;


import Unit8.Task1.Jacket.Jacket;
import Unit8.Task1.Shoes.Shoes;
import Unit8.Task1.Trousers.Trousers;

public class Person {
    private String name;
    private Shoes shoes;
    private Trousers trousers;
    private Jacket jacket;


    public Person(String name, Shoes shoes, Trousers trousers, Jacket jacket) {
        this.name = name;
        this.shoes = shoes;
        this.trousers = trousers;
        this.jacket = jacket;
    }

    public String getName() {
        return name;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public Jacket getJacket() {
        return jacket;
    }

    void putOn(){
        System.out.println("Одеваем "+getName());
        getJacket().putOn();
        getShoes().putOn();
        getTrousers().putOn();
    }

    void takeOff(){
        System.out.println("Раздеваем "+getName());
        getJacket().takeOff();
        getShoes().takeOff();
        getTrousers().takeOff();
    }

}
