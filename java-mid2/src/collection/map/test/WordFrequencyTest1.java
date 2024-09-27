package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> count = new HashMap<>();
        String[] fruits = text.split(" ");

        for (String fruit : fruits) {
            count.put(fruit, count.getOrDefault(fruit, 0) + 1);
        }

        System.out.println(count);
    }


}
