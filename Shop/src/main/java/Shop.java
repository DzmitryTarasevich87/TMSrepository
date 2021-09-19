import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.desktop.AppForegroundListener;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Shop {
    @JsonProperty("ProductsList")
    public List<Product> productsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    public List<Product> editShopList() {
        return productsList;
    }

    public void addProduct(int idProd, String nameProd, int priceProd) {

        Product product = new Product(idProd, nameProd, priceProd);

        Optional<Product> isPresent = productsList.stream().filter(p -> p.getId() == idProd).findAny();
        isPresent.ifPresentOrElse(
                v -> System.out.println("Товар с таким id уже существует"),
                () -> productsList.add(product)
        );
    }

    public void deleteProd(int idProd) {
        productsList.removeIf(i -> i.getId() == idProd);

    }

    public void editProduct(int idProd, String nameProd, int priceProd) {

        Optional<Product> optionalProduct = productsList.stream()
                .filter(p -> p.getId() == idProd)
                .findAny();
        if (optionalProduct.isPresent()) {
            optionalProduct.get().setName(nameProd);
            optionalProduct.get().setPrice(priceProd);
        }
    }

    public void filterByPrice(int minPrice, int maxPrice) {
        System.out.println(productsList.stream()
                .filter(p -> p.getPrice() >= minPrice)
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList()));
    }

    public void sortWithLambda(List<Product> list, AnySort sort) {
        sort.doing(list);
        System.out.println(list);
    }

    public void testShopping(Consumer consumer, Producer producer, Application app) {
        app.loadProductList();
        new Thread(consumer).start();
        new Thread(producer).start();
        app.saveProductList();

    }

    public synchronized void get() {
        while (editShopList().size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        int id = 0;
        Optional<Product> prod = productsList.stream()
                .findAny();
        if (prod.isPresent()) {
            id = prod.get().getId();
        }
        deleteProd(id);
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + editShopList().size());
        notify();
    }

    public synchronized void put() {
        while (editShopList().size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
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
        addProduct(idProd, nameProd, priceProd);
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + editShopList().size());
        notify();
    }

    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("[A-ZА-Я]\\s?([a-zа-я]+\\s?)*\\S?(\\s?\\d\\s?\\d*)*");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

}

@FunctionalInterface
interface AnySort {
    void doing(List<Product> productList);
}

class Consumer implements Runnable {
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            shop.get();
        }
    }
}

class Producer implements Runnable {
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            shop.put();
        }
    }
}