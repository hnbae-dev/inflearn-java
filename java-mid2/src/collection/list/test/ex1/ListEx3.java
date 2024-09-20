package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int total = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            total += number;
            numbers.add(number);
        }

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double) total / numbers.size());
    }

}
