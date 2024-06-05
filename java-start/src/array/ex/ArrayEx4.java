package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");

        int total = 0;
        double average;

        for (int i = 0; i < 5; i++) {
            total += in.nextInt();
        }

        average = (double) total / 5;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
