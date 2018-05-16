
package tests;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Kevin's Account
 */
public class StringTests {
    @Test
    public void testAssertThat() {
        String testString = "My Test String";
        assertThat(testString, is("My Test String"));
    }
    
    @Test
    public void testAssertTrueAndFalse() {
        String testString = "My Amazing Test String";
        assertTrue(testString.contains("Amazing"));
        assertFalse(testString.contains("Lame"));
    }
    
    @Test
    public void testAssertSame() {
        String testString = "My Not-CopyRighted Test String";
        String secondTestString = testString;
        assertSame(testString, secondTestString);
    }
}