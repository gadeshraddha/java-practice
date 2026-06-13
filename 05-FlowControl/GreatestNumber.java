//greatest of three numbers

import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer a: ");
        int a = sc.nextInt();

        System.out.println("Enter integer b: ");
        int b = sc.nextInt();

        System.out.println("Enter integer c: ");
        int c = sc.nextInt();

        // code here
        if (a>=b && a>=c) {
            System.out.println(a + " is the greatest number");
        } else if (b>=a && b>=c) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
    }
}