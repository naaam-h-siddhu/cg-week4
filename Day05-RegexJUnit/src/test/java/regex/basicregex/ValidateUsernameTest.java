package regex.basicregex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUsernameTest {

    String[] usernames = new String[3];
    @BeforeEach
    void setUsernames(){
        usernames[0] = "user123";
        usernames[1] = "123user";
        usernames[2] = "ete";
    }
    @Test
    void checkUsername() {
        assertTrue(ValidateUsername.checkUsername(usernames[0]));
        System.out.println("Test 1 Passed !!");
    }
    @Test
    void checkUsernameLength(){
        assertFalse(ValidateUsername.checkUsername(usernames[2]));
        System.out.println("Test 2 Passed !!");
    }
}