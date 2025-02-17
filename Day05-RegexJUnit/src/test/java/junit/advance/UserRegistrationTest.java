package junit.advance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
   UserRegistration registration = new UserRegistration();
   @Test
    void testValidRegistration(){
       assertEquals("USER REGISTERED", registration.registerUser("Siddhu","siddhu@gmail.com","Pass@12"));

   }
   @Test
    void testInvalidEmail(){
       assertThrows(IllegalArgumentException.class, ()-> {
           registration.registerUser("siddhu","sdfs@@.com","Pass322#@");
       });
   }
   @AfterEach
    void turnDown(){
       System.out.println("✅ Test Passed !");
   }
}