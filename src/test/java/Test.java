import com.edataconsulting.edatalabs.Item;

import java.util.List;

import static com.edataconsulting.edatalabs.Price.calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testOk() {
        List<Item> itemList = List.of(
                new Item(30.0, 10.0, 6.0),
                new Item(50.0, 25.0, null));
        assertEquals(89.5, calculate(itemList));
    }

}
