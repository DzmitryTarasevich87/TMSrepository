package Unit8.Task2;

public interface iStart {
    default boolean prelaunchSystemCheck() {
        return true;
    }

    void engineStart();

    void start();
}
