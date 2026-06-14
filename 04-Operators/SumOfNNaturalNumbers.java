import java.util.Scanner;

class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value for n: ");
        int n = sc.nextInt();

        
        int ans = 0;
        for (int i=0; i<=n; i++)
        ans = ans + i;
        
        System.out.println("the sum of numbers till " + n + " is " +ans);
    }
}