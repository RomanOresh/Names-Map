package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class DataRepositoryTest {
    private Map<Integer,String > map;

    @BeforeEach
    void setUp(){
        map = new HashMap<>();
    }

    @Test
    void putTest_noExceptionThrow(){
        Integer key = 5;
        String value = "value";

        map.put(key,value);

    }
    @Test
    void putTest_afterPuttingSizeNotZero() {
        Integer key = 5;
        String value = "value";

        map.put(key, value);

        int size = map.size();

        assertNotEquals(size, 0);
    }

    @Test
    void putTest_afterPuttingSameKeyNewValueIsReturned() {
        Integer key = 5;
        String value = "value";
        map.put(key, value);

        String newValue = "newValue";
        map.put(key, newValue);

        String i = map.get(key);

        assertEquals(i, newValue);
    }

    @Test
    void getTest_emptyReturnsNull() {
        String i = map.get(5);

        assertNull(i);
    }

    @Test
    void getTest_nonEmptyReturnsValue() {
        Integer key = 5;
        String value = "value";
        map.put(key, value);

        String i = map.get(key);

        assertNotNull(i);
        assertEquals(value, i);
    }
}
