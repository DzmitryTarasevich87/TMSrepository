package ShopUnit12;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    private Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);
    File shopProductList = new File("Unit1/src/ShopUnit12/shop_product_list.dat");

    public void start() {

        loadProductList();
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
                saveProductList();
                break;
            }
        }
    }

    public void showShop() {

        System.out.println("Сортировать по:\n" +
                "1. цене(возростание)\n" +
                "2. цене(убывание)\n" +
                "3. по добавлению\n" +
                "4. фильтр по цене\n" +
                "5. вернуться в прошлое меню");
        int choice = sc.nextInt();
        if (choice == 1) {
            shop.sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getPrice)));
        }
        if (choice == 2) {
            shop.sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getPrice).reversed()));
        }
        if (choice == 3) {
            shop.sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getDateAdded)));
        }
        if (choice == 4) {
            filterByPrice();
        }
        if (choice == 5) {
            start();
        }
    }

    public void addProduct() {
        String nameProd;
        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        while (true) {
            String name = sc.nextLine();
            if (checkName(name)) {
                nameProd = name;
                break;
            } else {
                System.out.println("Неккоректное название");
            }
        }

        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();
        shop.addProduct(idProd, nameProd, priceProd);
    }

    public void deleteProd() {
        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        shop.deleteProd(idProd);
    }

    public void loadProductList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(shopProductList))) {
            shop.productsList = (ArrayList) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveProductList() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(shopProductList))) {
            oos.writeObject(shop.editShopList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editProduct() {
        String nameProd;
        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        while (true) {
            String name = sc.nextLine();
            if (checkName(name)) {
                nameProd = name;
                break;
            } else {
                System.out.println("Неккоректное название");
            }
        }
        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();

        shop.editProduct(idProd, nameProd, priceProd);
    }

    public void filterByPrice() {
        System.out.println("Введите минимальную стоимость товара");
        int minPrice = sc.nextInt();
        System.out.println("Введите максимальную стоимость товара");
        int maxPrice = sc.nextInt();
        shop.filterByPrice(minPrice, maxPrice);
    }

    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^[A-ZА-Я]([a-zа-я]+\\s?)+\\S(\\s?\\d\\s?\\d*)*");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }
}



