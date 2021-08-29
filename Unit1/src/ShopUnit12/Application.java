package ShopUnit12;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {

    private Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);

    public void start() {


        while (true) {
            System.out.println("Добро пожаловать в магазин!\n" +
                    "1. Просмотр товаров\n" +
                    "2. Добавление товара\n" +
                    "3. Удаление товара\n" +
                    "4. Редактирование товара\n" +
                    "5. Выход");
            int a = sc.nextInt();
            if (a == 1) {
                showShop();
            }
            if (a == 2) {
                addProduct();
            }
            if (a == 3) {
                deleteProd();
            }
            if (a == 4) {
                editProduct();
            }
            if (a == 5) {
                System.out.println("Всего доброго!");
                break;
            }
        }

    }

    public void showShop() {

        System.out.println("Сортировать по:\n" +
                "1. цене(возростание)\n" +
                "2. цене(убывание)\n" +
                "3. по добавлению\n" +
                "4. вернуться в прошлое меню");
        int choice = sc.nextInt();
        if (choice == 1) {
            sortInAscending(shop.productsList);
        }
        if (choice == 2) {
            sortInDescending(shop.productsList);
        }
        if (choice == 3) {
            sortByAddition(shop.productsList);
        }
        if (choice == 4) {
            start();
        }

    }

    public void sortInAscending(List<Product> list) {
        list.sort(Comparator.comparing(Product::getPrice));
        System.out.println(list);
    }

    public void sortInDescending(List<Product> list) {
        list.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(list);
    }

    public void sortByAddition(List<Product> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void addProduct() {

        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        String nameProd = sc.next();
        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();

        shop.addProduct(new Product(idProd, nameProd, priceProd));

    }

    public void deleteProd() {

        System.out.println("Введите id товара");
        int idProd = sc.nextInt();

        shop.deleteProduct(idProd);

    }

    public void editProduct() {


        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        String nameProd = sc.next();
        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();


        int a = 0;
        for (int i = 0; i < shop.productsList.size(); i++) {
            if (shop.productsList.get(i).getId() == idProd) {
                a = i;
            }
        }
        shop.productsList.get(a).setName(nameProd);
        shop.productsList.get(a).setPrice(priceProd);

    }

}
