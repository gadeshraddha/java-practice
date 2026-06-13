import java.util.Scanner;

class BitwiseRightShift {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter digit a: ");
        int a = sc.nextInt();

        System.out.println("enter digit b: ");
        int b= sc.nextInt();
        
        System.out.println(a>>b);
    }
}
