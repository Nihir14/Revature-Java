package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathServiceTest {

    MathService mathService = new MathService();

    @Test
    public void testSquare() {

        assertEquals(25,mathService.square(5));
    }

    @Test
    public void testMaxA() {

        assertEquals(10,mathService.max(10, 2));
    }

    @Test
    public void testMaxB() {

        assertEquals(10,mathService.max(2, 10));
    }

}
