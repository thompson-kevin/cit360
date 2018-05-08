
package junit;
import junit.tests.InitialTest;
import junit.tests.MathHelperTests;
import junit.tests.StringTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Kevin's Account
 */
public class Junit {

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
