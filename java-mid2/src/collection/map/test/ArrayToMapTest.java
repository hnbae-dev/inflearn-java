package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> products = new HashMap<>();
        for (String[] product : productArr) {
            products.put(product[0], Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력
        for (Entry<String, Integer> product : products.entrySet()) {
            System.out.println("제품: " + product.getKey() + ", 가격: " + product.getValue());
        }

    }

}
