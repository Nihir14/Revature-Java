package test;

import shapes.Square;

/*
 * Using Square class from another package
 */
public class SquareTest {

    public static void main(String[] args) {

        // Creating object of Square class
        Square sq = new Square(5);

        System.out.println("Side: " + sq.getSide());
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());
    }
}
