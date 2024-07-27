package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i=num1; i<=num2; i++) {
            System.out.print(i);
            if(i != num2) {
                System.out.print(", ");
            }
        }
    }
}
