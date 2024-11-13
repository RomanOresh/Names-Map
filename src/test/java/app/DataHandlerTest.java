package app;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DataHandlerTest {
    private DataHandler dataHandler;


    @BeforeEach
    void setUp(){
    dataHandler = new DataHandler();
    }
    @Test
    void getAllTest(){
       String expectedOutput = "\nALL NAMES: \n" +
               "1) 387, Lucy\n" +
               "2) 231, Alice\n" +
               "3) 394, Bob\n" +
               "4) 172, Tom\n";

       String actualOutput = dataHandler.getAll();


        assertEquals(expectedOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
    }
    @Test
    void getByIdTest(){
        assertEquals("NAME: id 387, Lucy",dataHandler.getById(387));
    }
    @Test
    void getByIdNotExistsTest(){
        assertEquals("No data!", dataHandler.getById(1));
    }

}
