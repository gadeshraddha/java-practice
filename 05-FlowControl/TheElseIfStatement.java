import java.util.Scanner;

public class TheElseIfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to know big/small/number: ");
        int number = sc.nextInt();

        if (number > 100) {
            System.out.println("Big");
        } else if (number < 10) {
            System.out.println("Small");
        } else {
            System.out.println("Number");
        }

        sc.close();
    }
}