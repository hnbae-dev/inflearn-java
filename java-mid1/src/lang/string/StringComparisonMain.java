package lang.string;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대소문자
        String str2 = "hello, java!"; // 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
    }
}
