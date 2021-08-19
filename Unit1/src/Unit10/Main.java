package Unit10;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 260, 35000);
        Car car2 = new Car("Audi", 270, 32000);

        method(car1);
        method(car2);
    }

    static void method(Car car) {
        try {
            car.start();
        } catch (StartException e) {
            System.out.println(e.getMessage());
        }
    }
}
