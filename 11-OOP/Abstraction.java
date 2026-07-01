/*Implement the following classes to understand abstraction in Java :
Note: Driver code makes all the function calls and print statements

Name: Shape (Abstract)
Data member/Attributes: color (String)
Constructor: Shape(String c) -> assign value of c to color
Methods/Functions: getColor() -> returns value of color
                   getArea() -> abstract function with double return type

                   Name: Square (extends Shape)
Data member/Attributes: side (double)
Constructor: Square(String c, double side) -> calls super(c) function and assign value to side.
Method/Function: getArea() -> returns area of square*/

abstract class Shape {

    String color;

    Shape(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}


class Square extends Shape {

    double side;

    Square(String c, double side) {
        super(c);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}


public class Abstraction {

    public static void main(String[] args) {

        Square square = new Square("Red", 5.0);

        System.out.println("Color of the square: " + square.getColor());
        System.out.println("Area of the square: " + square.getArea());
    }
}