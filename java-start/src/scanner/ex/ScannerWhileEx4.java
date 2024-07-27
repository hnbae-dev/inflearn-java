package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        // 상품명, 가격, 수량 => 총 가격 출력
        Scanner sc = new Scanner(System.in);

        int option = 0;
        String productName;
        int price;
        int amount;
        int totalPrice = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = sc.nextInt();

            if(option == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요: ");
                productName = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                amount = sc.nextInt();

                totalPrice += price * amount;

                System.out.println("상품명:" + productName + " 가격:" + price + " 수량:" + amount + " 합계:" + price * amount);
            } else if(option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if(option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
