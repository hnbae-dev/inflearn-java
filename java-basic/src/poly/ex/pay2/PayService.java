package poly.ex.pay2;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option); // 1. 결제수단을 선택
        boolean result = pay.pay(amount); // 2. 실제 결제를 수행하는 부분

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
