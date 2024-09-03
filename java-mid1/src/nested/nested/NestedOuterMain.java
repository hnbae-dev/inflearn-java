package nested.nested;

import nested.nested.NestedOuter.Nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

        System.out.println("nestedClass = "  + nested.getClass());
    }

}
