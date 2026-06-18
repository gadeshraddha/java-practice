// Write the complete argumentFunction below.
// The function should take two arguments a and b
// The function should return a+b
import java.util.Scanner;

class FunctionWithArguments {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println(argumentFunction(a,b));

        sc.close();
    }
    public static int argumentFunction( int a, int b) {
        return a + b;
    }
}