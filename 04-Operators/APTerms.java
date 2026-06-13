import java.util.Scanner;

class APTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number first term a:  ");
        int a = sc.nextInt();

        System.out.println("Enter number common difference d:  ");
        int d = sc.nextInt();

        System.out.println("Enter number nth term n:  ");
        int n = sc.nextInt();

        // code here
        int ans = (a + (n-1)*d);
        System.out.println(ans);
    }
}
