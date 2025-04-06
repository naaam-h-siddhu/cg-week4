package regex.replaceandmodify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceMultipleSpaceTest {

    @Test
    void removeExtraSpace() {
        String text = "     ";
        assertEquals(" ",ReplaceMultipleSpace.removeExtraSpace(text));
    }
}