package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] str = email.split("@");
        System.out.println("ID: " + str[0]);
        System.out.println("Domain: " + str[1]);
    }

}
