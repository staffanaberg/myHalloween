package testFiles;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class MyTest {

    @Test
    public void myFirstTest() {


        assertEquals(3, 3);
    }

    @Test
    public void mySecondTest() {

        int x = 2;

        int actual = x*2;
        int expected = 4;

        assertEquals(expected, actual);
    }

}
