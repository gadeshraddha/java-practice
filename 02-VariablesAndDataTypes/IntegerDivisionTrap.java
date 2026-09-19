public class IntegerDivisionTrap {
    public static void main (String[] args) {
        int a = 10;
        int b = 3;
        double c = a/b;
        System.out.println("Result of integer division: " + c + " (victim of integer division trap omits the decimal part)");

        //two ways to solve this
        double d = (double) a / b;
        System.out.println("Result of double division: " + d + " (casting a to double before division)");

        double e = 10.0 / b;
        System.out.println("Result of double division: " + e + " (using a double literal for the numerator)");

    }
}