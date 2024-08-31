package enumeration.test.ex1;

import static enumeration.test.ex1.AuthGrade.*;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = values();
        for (AuthGrade authGrade : authGrades) {
            printAuthGrade(authGrade);
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
    }

}
