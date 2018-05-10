
package collectionHelpers;

import java.util.LinkedList;

/**
 *
 * @author Kevin's Account
 */
public class LinkedListHelper {

    public static LinkedList getLinkedList(int length) {
        LinkedList linkedList = new LinkedList();
        for (int i = length; i > 0; i--) {
            linkedList.add(i);
        }
        return linkedList;
    }
    
}
