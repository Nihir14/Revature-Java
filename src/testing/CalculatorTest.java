package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();

        int result = calculator.add(30, 20);

        assertEquals(50, result);
    }
}
