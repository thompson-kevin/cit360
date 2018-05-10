
package collectionHelpers;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kevin's Account
 */
public class QueueHelper {
    public static Queue getQueue(int queueLength) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < queueLength; i++) {
            queue.add(i);
        }
        return queue;
    }
}
