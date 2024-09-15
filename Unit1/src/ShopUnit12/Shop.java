package ShopUnit12;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        boolean isId = false;
        for (Product prod : productsList) {
            if (prod.getId() == product.getId()) {
                isId = true;
            }
        }
        if (!isId) {
            productsList.add(product);
        }
    }

    public List<Product> getAllProducts() {
        return productsList;
    }

    public void editTheProduct(Product product) {
        int prodId = product.getId();

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == prodId) {
                productsList.get(i).setName(product.getName());
                productsList.get(i).setPrice(product.getPrice());
            }
        }
    }

}