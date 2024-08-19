package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8, 10};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
