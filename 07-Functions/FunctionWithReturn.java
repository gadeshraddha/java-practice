import java.util.Scanner;

public class FunctionWithReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();


        FunctionWithReturn obj = new FunctionWithReturn();

        int result = obj.returnFunction(n);

        System.out.println(n+ " multiplied by 2 is " + result);
    }

    int returnFunction(int n) {
        return n * 2;
    }
}