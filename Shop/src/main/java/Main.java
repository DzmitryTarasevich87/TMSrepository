public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Consumer consumer = new Consumer(app.getShop());
        Producer producer = new Producer(app.getShop());
        app.getShop().testShopping(consumer,producer,app);
//        app.start();
    }
}
