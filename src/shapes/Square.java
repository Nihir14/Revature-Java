package shapes;

/*
 * Square class
 * Java Training Example
 */
public class Square {

    private int side;

    // Constructor
    public Square(int side) {
        this.side = side;
    }

    // Method to calculate area
    public int area() {
        return side * side;
    }

    // Method to calculate perimeter
    public int perimeter() {
        return 4 * side;
    }

    // Getter
    public int getSide() {
        return side;
    }
}
