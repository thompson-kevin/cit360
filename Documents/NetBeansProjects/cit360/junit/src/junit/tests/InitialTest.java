package junit.tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Kevin's Account
 */
public class InitialTest {
    @Test
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}
