package nested.nested.test;

import nested.nested.test.OuterClass2.InnerClass;

public class OuterClass2Main {

    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }

}
