package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        LocalDate firstDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDay = firstDate.getDayOfWeek();

        int lengthOfMonth = firstDate.lengthOfMonth();
        int ordinal = firstDay.ordinal();
        int count = ordinal + 2;

        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        for (int i = 0; i < (count - 1) % 7; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= lengthOfMonth; i++) {
            System.out.printf("%2d ", i);
            if(count % 7 == 0) {
                System.out.println();
                count %= 7;
            }
            count++;
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + "ms");
    }
}
