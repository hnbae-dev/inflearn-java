package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + quantity);
    }

    public void minus(Product product, int quantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

}
