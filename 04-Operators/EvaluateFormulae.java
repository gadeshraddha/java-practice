import java.util.Scanner;

class EvaluateFormulae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        int a = sc.nextInt();

        System.out.println("enter b: ");
        int b = sc.nextInt();
        
        System.out.println("enter c: ");
        int c = sc.nextInt();

        System.out.println("enter d: ");
        int d = sc.nextInt();

        int ans = (((a+b)/c)+d);
        System.out.println(ans);
    }
}