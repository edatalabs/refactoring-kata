package com.edataconsulting.edatalabs.service.price;
import com.edataconsulting.edatalabs.model.CartItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceCalculationServiceTest {
    PriceCalculationServiceImpl priceCalculationService = new PriceCalculationServiceImpl();

    @Test
    @DisplayName("should test the price calculation method given a cart list with two valid items")
    public void testPriceCalculation() {
        //Given
        List<CartItem> cartItems = List.of(new CartItem(30, 10, 6),
                new CartItem(50, 25, 0));

        //Then
        assertEquals(89.5, priceCalculationService.calculate(cartItems));
    }

}
