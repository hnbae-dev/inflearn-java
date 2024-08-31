package enumeration.ref1;

public class DiscountService {

    // 회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
