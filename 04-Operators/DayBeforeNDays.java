import java.util.Scanner;

class DayBeforeNDays {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter current day d: ");
        int d = sc.nextInt();

        System.out.println("enter n: ");
        int n = sc.nextInt();

        int ans = ((d - (n % 7)+7)%7);
        System.out.println(ans);

        // can add switch statement for 1-7 which will tell what day it is
    }
}