import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class factorialfinder {
    @Test
    void shouldReturnOneIfTheNumberIsEqualToZero() {
        Factorial factorial = new Factorial(0);
        int fact = factorial.find();
        assert fact == 1;
    }

    @Test
    void checkIfTheFactorialOfFiveIsOneTwenty() {
        assert new Factorial(5).find()==120;
    }

    @Test
    void shouldReturnNegativeIfTheNumberIsNegative() {
        Factorial factorial = new Factorial(-20);
        int fact = factorial.find();
        Assertions.assertEquals(fact,-1);
    }

    @Test
    void shouldReturnOneIfNumberIsOne() {
        Factorial factorial = new Factorial(1);
        int fact = factorial.find();
        Assertions.assertEquals(fact,1);
    }
}
