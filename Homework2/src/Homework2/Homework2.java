package Homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        monthName(month);
    }

    public static void monthName(String monthName) {
        int days=0;

        if (monthName.equals("January")) {
            days = 31;
        } else if (monthName.equals("February")) {
            days = 29;
        } else if (monthName.equals("March")) {
            days = 31;
        } else if (monthName.equals("April")) {
            days = 30;
        } else if (monthName.equals("May")) {
            days = 31;
        } else if (monthName.equals("June")) {
            days = 30;
        } else if (monthName.equals("July")) {
            days = 31;
        } else if (monthName.equals("August")) {
            days = 31;
        } else if (monthName.equals("September")) {
            days = 30;
        } else if (monthName.equals("October")) {
            days = 31;
        } else if (monthName.equals("November")) {
            days = 30;
        } else if (monthName.equals("December")) {
            days = 31;
        }
        System.out.println(days);
    }
}