/*Implement MethodOverloading class with the following methods to understand Method Overloading in Java:
Name: sum
Parameters: a(int), b(int)
Return: sum of a and b -> int

Name: sum
Parameters: a(int), b(int), c(int)
Return: sum of a, b and c -> int

Name: sum
Parameters: x(double), y(double)
Return: sum of x and y -> double*/

class MethodOverloading {

    // Method to sum two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to sum three integers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to sum two doubles
    public double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        // Testing sum methods
        System.out.println("Sum of 2 and 3: " + mo.sum(2, 3)); // Calls sum(int, int)
        System.out.println("Sum of 1, 2 and 3: " + mo.sum(1, 2, 3)); // Calls sum(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + mo.sum(2.5, 3.5)); // Calls sum(double, double)
    }
}