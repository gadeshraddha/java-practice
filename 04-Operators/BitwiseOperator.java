import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Bitwise Operators ");

        System.out.println("Enter A: ");
        int a = scn.nextInt();

        System.out.println("Enter B: ");
        int b = scn.nextInt();

        System.out.println("Enter C: ");
        int c = scn.nextInt();
       
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a ^ a);
        
        e = ~e;
        
        System.out.println(d + " " + e + " " + f + " " + g);
    }
}