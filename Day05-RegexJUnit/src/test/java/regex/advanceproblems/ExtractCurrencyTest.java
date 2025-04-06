package regex.advanceproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCurrencyTest {
    List<String> currencies;
    @BeforeEach
    void setCurrencies(){
        String text = "The price is $45.99, and the discount is 10.50.";
        currencies = ExtractCurrency.extractCurrency(text);

    }

    @Test
    void extractCurrency() {
        assertTrue(currencies.contains("$45.99"));
        System.out.println("✅ Test Passed !!");
    }
}