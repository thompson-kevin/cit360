
package collectionHelpers;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kevin's Account
 */
public class SetHelper {

    public static Set getSet(int numberOfDoublesInput) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(11);
        set.add(3);

        try {
            for (int i = numberOfDoublesInput; i > 0; i--) {
                set.add(i);
                // this won't work, but is for demo purposes
                set.add(i);
            }
            return set;
        } catch (Exception e) {
            System.out.println(e);
            return set;
        }
    }
}
