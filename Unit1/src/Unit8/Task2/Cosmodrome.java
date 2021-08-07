package Unit8.Task2;

public class Cosmodrome {

    void launch(iStart istart) {
        if (istart.prelaunchSystemCheck()) {

            istart.engineStart();
            //обратный отсчет
            try {
                for (int i = 10; i >= 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            istart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
}


