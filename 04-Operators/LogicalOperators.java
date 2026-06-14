import java.util.Scanner;

class LogicalOperators {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter true/false value for a: ");
        boolean a = sc.nextBoolean();

        System.out.println("enter true/false value for b: ");
        boolean b = sc.nextBoolean();

        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notResult = !a;
        
        System.out.println(" the and result is: " + andResult + " the or result: " + orResult + " the not result: " + notResult);
    }
}