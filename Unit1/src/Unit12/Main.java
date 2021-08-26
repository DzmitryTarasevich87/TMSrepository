package Unit12;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product milk = new Product(12, "Milkovit", 32);
        Product bread = new Product(31, "Mag", 17);
        Product sugar = new Product(42, "Skidel", 21);
        Product milk2 = new Product(12, "Krunka", 30);

        shop.addProduct(milk);
        shop.addProduct(bread);
        shop.addProduct(sugar);

        shop.getAllProducts();

        sort(shop.productsList);
        for (Product product : shop.productsList) {
            System.out.println(product);
        }
        for (int i = shop.productsList.size()-1; i >=0 ; i--) {
            System.out.println(shop.productsList.get(i));
        }

        shop.editTheProduct(milk2);

        for (Product product : shop.getAllProducts()) {
            System.out.println(product);
        }

    }
}
