
package junittests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import tests.InitialTest;
import tests.MathHelperTests;
import tests.StringTests;
/**
 *
 * @author Kevin's Account
 */
public class JunitTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(InitialTest.class, MathHelperTests.class, StringTests.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
    
}
