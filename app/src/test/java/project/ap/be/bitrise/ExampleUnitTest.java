package project.ap.be.bitrise;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void add_isCorrect() throws Exception {
        assertEquals(4, Units.addNumbers(2 , 2));
    }

    @Test
    public void add_twodigits_isCorrect() throws Exception {
        assertEquals(44, Units.addNumbers(22 , 22));
    }

    @Test
    public void add_big_isCorrect() throws Exception {
        assertEquals(4444, Units.addNumbers(2222 , 2222));
    }
    }
