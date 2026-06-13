import java.util.Scanner;

class TheElseStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to know big/small: ");
        int a = sc.nextInt();

        // code here
        if (a>100) {
            System.out.println("Big");
        } else {
            System.out.println("Small");
        }
    }
}