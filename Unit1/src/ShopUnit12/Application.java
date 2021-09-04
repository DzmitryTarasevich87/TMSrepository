package ShopUnit12;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Application {

    private Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);
    File shopProductList = new File("Unit1/src/ShopUnit12/shop_product_list.dat");

    public void start() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(shopProductList))) {

            shop.productsList = (ArrayList) ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

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
            sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getPrice)));
        }
        if (choice == 2) {
            sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getPrice).reversed()));
        }
        if (choice == 3) {

            sortWithLambda(shop.productsList, sorter -> shop.productsList.sort(Comparator.comparing(Product::getDateAdded)));

        }
        if (choice == 4) {
            filterByPrice();
        }
        if (choice == 5) {
            start();
        }


    }

    public void sortWithLambda(List<Product> list, AnySort sort) {
        sort.doing(list);
        System.out.println(list);
    }

    public List<Product> editShopList() {
        return shop.productsList;
    }

    public void saveProductList() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(shopProductList))) {
            oos.writeObject(editShopList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProduct() {

        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        String nameProd = sc.next();
        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();
        Product product = new Product(idProd, nameProd, priceProd);

        Optional<Product> isPresent = shop.productsList.stream().filter(p -> p.getId() == idProd).findAny();
        isPresent.ifPresentOrElse(
                v -> System.out.println("Товар с таким id уже существует"),
                () -> shop.productsList.add(product)
        );


    }

    public void deleteProd() {

        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        shop.productsList.removeIf(i -> i.getId() == idProd);

    }

    public void editProduct() {

        System.out.println("Введите id товара");
        int idProd = sc.nextInt();
        System.out.println("Введите название товара");
        String nameProd = sc.next();
        System.out.println("Введите цену товара");
        int priceProd = sc.nextInt();

        Optional<Product> optionalProduct = shop.productsList.stream()
                .filter(p -> p.getId() == idProd)
                .findAny();
        if (optionalProduct.isPresent()) {
            optionalProduct.get().setName(nameProd);
            optionalProduct.get().setPrice(priceProd);
        }
    }

    public void filterByPrice() {
        System.out.println("Введите минимальную стоимость товара");
        int minPrice = sc.nextInt();
        System.out.println("Введите максимальную стоимость товара");
        int maxPrice = sc.nextInt();

        System.out.println(shop.productsList.stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList()));

    }

}

@FunctionalInterface
interface AnySort {
    void doing(List<Product> productList);
}

