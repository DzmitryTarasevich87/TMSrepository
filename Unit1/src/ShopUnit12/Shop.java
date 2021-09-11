package ShopUnit12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shop {

    public List<Product> productsList = new ArrayList<>();

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
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList()));
    }

    public void sortWithLambda(List<Product> list, AnySort sort) {
        sort.doing(list);
        System.out.println(list);
    }

}

@FunctionalInterface
interface AnySort {
    void doing(List<Product> productList);
}