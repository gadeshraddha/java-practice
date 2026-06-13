import java.util.*;

class BasicOperator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Operator");
        int operator = sc.nextInt();

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();
        
        if (operator == 1) {
            System.out.print(a+b);
        } else if (operator == 2) {
            System.out.print(a-b);
        }else if (operator == 3) {
            System.out.print(a*b);
        }else {
            System.out.print("Invalid Input");
        }
    }
}
