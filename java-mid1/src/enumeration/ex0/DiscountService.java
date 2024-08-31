package enumeration.ex0;

public class DiscountService {
    // 회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPercent / 100;
    }
}
