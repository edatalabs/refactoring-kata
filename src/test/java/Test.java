import static com.edataconsulting.edatalabs.Price.calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testOk() {
        assertEquals(89.5, calculate(30, 10, 6, 50));
    }

}
