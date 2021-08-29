package ShopUnit12;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Product> productsList = new ArrayList<>();

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

    public void deleteProduct(int id) {
        int prodIndex = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                prodIndex = i;
            }
        }
        productsList.remove(prodIndex);
    }

    public void editTheProduct(Product product) {
        int prodId = product.getId();
        int a = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == prodId){
                a = i;
            }
        }
        productsList.get(a).setName(product.getName());
        productsList.get(a).setPrice(product.getPrice());

    }

}