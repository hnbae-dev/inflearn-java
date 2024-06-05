package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.println("출력");

        for(int i=0; i<numbers.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
    }
}
