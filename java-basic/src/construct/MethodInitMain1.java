package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.name = "user1";
        m1.age = 15;
        m1.grade = 90;

        MemberInit m2 = new MemberInit();
        m2.name = "user2";
        m2.age = 16;
        m2.grade = 80;

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
