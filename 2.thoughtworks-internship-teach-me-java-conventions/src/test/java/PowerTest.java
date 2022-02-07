import org.junit.Test;
import org.junit.Before;

public class PowerTest {
    private PowerFinder powerFinder;
    @Before
    public void setUp () {
        this.powerFinder = new PowerFinder();
    }   
    @Test
    public void oneRaisedtoOneisOne() {
        assert powerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneisTwo() {
        assert powerFinder.of(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoisFour() {
        assert powerFinder.of(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoisNine() {
        assert powerFinder.of(3, 2) == 9;
    }
}
