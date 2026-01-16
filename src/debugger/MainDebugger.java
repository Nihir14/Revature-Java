package debugger;

public class MainDebugger {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        LoopDebugger loop = new LoopDebugger();

        int result = calc.add(10, 20);
        System.out.println("Addition: " + result);

        loop.printNumbers();

        int division = calc.divide(10, 2);
        System.out.println("Division: " + division);
    }
}
