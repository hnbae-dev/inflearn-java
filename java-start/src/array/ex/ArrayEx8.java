package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int n = sc.nextInt();

        int[][] scores = new int[n][3];
        String[] subjects = {"국어", "영어", "수학"};

        int total;
        double average;

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            average = (double) total / scores[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
