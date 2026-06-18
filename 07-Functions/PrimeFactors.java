import java.util.Scanner;

class PrimeFactors {
    public static void main (String []args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        PrimeFactorization(n);
    }
    public static void PrimeFactorization(int n) {
        
        for (int i=2; i<=n;) {
            if ((n % i) ==0) {
                System.out.print(i+ " ") ; n= n/i;
            } else {
                i++;
            }
        }
    }
}
