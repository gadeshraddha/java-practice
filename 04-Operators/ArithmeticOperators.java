import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X: ");
        int x = sc.nextInt();

        System.out.println("Enter Y: ");
        int y = sc.nextInt();

        int p = x + y;
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;

        System.out.println("Addition: " + p + "  Substraction: " + q + "  Multiplication: " + r + "  Division: " + s + "  Modulo: " + t);
    }
}