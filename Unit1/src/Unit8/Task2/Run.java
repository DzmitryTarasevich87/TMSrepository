package Unit8.Task2;

public class Run {
    public static void main(String[] args) {
       Cosmodrome cosmo = new Cosmodrome();

        iStart shuttle = new Shuttle();
        iStart spaceX = new SpaceX();
        cosmo.launch(shuttle);
    }
}
