package enumeration.ref2;

public class DiscountService {
    // 회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
