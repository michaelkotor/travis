import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int first = 10;
        int second = 20;
        int expected = 30;
        Assertions.assertEquals(expected, new Calculator().add(first, second));
    }
}
