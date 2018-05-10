
package collectionHelpers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin's Account
 */
public class MapHelper {
    public static Map<String, Integer> getStudentGradeMap() {
        Map<String, Integer> percentageGrades = new HashMap<>();
        percentageGrades.put("Steve", 99);
        percentageGrades.put("Bill", 72);
        percentageGrades.put("Karen", 95);
        percentageGrades.put("Camille", 100);
        percentageGrades.put("Martin", 83);
        percentageGrades.put("Dusty", 89);
        
        return percentageGrades;
    }
}
