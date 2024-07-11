package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = in.nextInt();
        in.nextLine();

        ProductOrder[] orders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = in.nextLine();

            System.out.print("가격: ");
            int price = in.nextInt();

            System.out.print("수량: ");
            int quantity = in.nextInt();
            in.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
