package regex.advanceproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPAddressTest {

    String[] addresses;
    @BeforeEach
    void setAddresses(){
        addresses = new String[]{"11.221.0.0","232.34.vd.42"};
    }
    @Test
    void isValidIP() {
        assertTrue(ValidateIPAddress.isValidIP(addresses[0]));
        System.out.println("✅ Test Passed ");
    }
    @Test
    void isValid2(){
        assertFalse(ValidateIPAddress.isValidIP(addresses[1]));
        System.out.println("✅ Test Passed");
    }
}