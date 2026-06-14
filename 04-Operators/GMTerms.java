import java.util.Scanner;

class GMTerms {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("enter a: ");
         int a = sc.nextInt(); 

         System.out.println("enter r: ");
         int r = sc.nextInt(); 

         System.out.println("enter n: ");
         int n = sc.nextInt();
       
        int ans = a;
         for (int i=1; i<n; i++)
         ans *=r;
        
            System.out.println(ans);
    }
}