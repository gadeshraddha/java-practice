import java.util.Scanner;

class FirstDigitOfNumber {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("enter n: ");
         int n = sc.nextInt();

        System.out.println(firstDigit(n));

        sc.close();
    }
    public static int firstDigit(int n) {
        
        while (n>=10) {
            n = n/10;
         
        }
    
        return n;
    }
    
}