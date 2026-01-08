package functional;

public class CalculatorTest {

    public static void main(String[] args) {

        // Using Lambda Expression
        Calculator calc = (a, b) -> a + b;

        int result = calc.add(10, 20);
        System.out.println("Addition Result: " + result);
    }
}
