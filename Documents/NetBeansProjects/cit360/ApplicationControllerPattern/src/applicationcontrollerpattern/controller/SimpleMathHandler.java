
package applicationcontrollerpattern.controller;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kevin's Account
 */
public class SimpleMathHandler {
    public int handleIt(int[] data) {
        try {
            int runningTotal = 0;
            for (int number : data) {
                runningTotal += number;
            }
            return runningTotal;

        } catch (Exception e) {
            return -1;
        }
    }
}
