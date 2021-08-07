package Unit8.Task2;

import java.util.Random;

public class SpaceX implements iStart {
    Random rnd = new Random();

    @Override
    public boolean prelaunchSystemCheck() {
        boolean check;
        int a = rnd.nextInt(10);
        if (a > 1 && a<8) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
