package solution;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();

        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        sc.close();

        LocalDate returnDate = LocalDate.of(returnYear, returnMonth, returnDay);
        LocalDate expectedDate = LocalDate.of(expectedYear, expectedMonth, expectedDay);

        long duration = ChronoUnit.DAYS.between(expectedDate, returnDate);

        System.out.println(returnDate);
        System.out.println(expectedDate);
        System.out.println(duration);

        long fine;
        if (duration <= 0)
            fine = 0;
        else if (expectedYear == returnYear && expectedMonth == returnMonth)
            fine = 15 * duration;
        else if (expectedYear == returnYear)
            fine = 500 * (returnMonth - expectedMonth);
        else
            fine = 10000;

        System.out.println(fine);



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
