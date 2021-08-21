package Unit11.Task4;

import java.io.*;

public class SerializableCar {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Unit1/src/Unit11/Task4/car.dat"))) {
            Car car1 = new Car("BMW", 270, 26000);
            oos.writeObject(car1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Unit1/src/Unit11/Task4/car.dat"))) {
            Car car1 = (Car) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
