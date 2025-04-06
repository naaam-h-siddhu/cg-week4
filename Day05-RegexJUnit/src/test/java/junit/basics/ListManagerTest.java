package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {
    ListManager listManager = new ListManager();
    List<Integer> list;
    @BeforeEach
    void setList(){
        list = new ArrayList<>();
        listManager.addElement(list,10);
        listManager.addElement(list,20);
    }
    @Test

    void addElement() {

        listManager.addElement(list,50);
        assertTrue(list.contains(50));
        assertFalse(list.contains(232));
    }

    @Test
    void removeElement() {
        listManager.removeElement(list,20);
        assertFalse(list.contains(20));
    }

    @Test
    void getSize() {
        assertEquals(2,listManager.getSize(list));
    }

    @AfterEach
    void afterTest(){
        System.out.println("✅ Test Passed !!");
    }
}