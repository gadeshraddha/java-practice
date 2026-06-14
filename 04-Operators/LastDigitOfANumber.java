import java.util.*;

class LastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n: ");
        int n = sc.nextInt();

       
        int ans = (n % 10);
        if (ans < 0)
        ans = (-ans);
        
        System.out.println(" the last digit of the number is " + ans);
    }
}