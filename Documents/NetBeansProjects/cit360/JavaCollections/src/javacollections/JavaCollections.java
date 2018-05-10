/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import collectionHelpers.LinkedListHelper;
import collectionHelpers.MapHelper;
import collectionHelpers.QueueHelper;
import collectionHelpers.SetHelper;
import collectionHelpers.TreeHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Kevin's Account
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("// List using a LinkedList");
        LinkedList linkedList = LinkedListHelper.getLinkedList(10);
        Iterator iterator = linkedList.iterator();
        System.out.print("\nLinked List values: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.print(" Used an iterator to go down the list.");
        
        System.out.println("\n\n// Set");
        Set<Integer> set = SetHelper.getSet(5);
        System.out.println("The raw set values: " + set + " Look Mom, no doubles!");
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The sorted set values: " + sortedSet + " Notice it's the same!");
        
        System.out.println("\n// Map");
        Map<String, Integer> percentageGrades = MapHelper.getStudentGradeMap();
        System.out.println("The classroom grades scored in a Map: " + percentageGrades);
        System.out.println("Karen's grade is: " + percentageGrades.get("Karen"));
        if (percentageGrades.containsValue(100)) {
            System.out.println("Someone is passing the class with a perfect score!");
        }
        percentageGrades.remove("Bill");
        System.out.println("Bill dropped the class, the remaining students and their grades: " + percentageGrades);
        
        System.out.println("\n// Queue");
        Queue queue = QueueHelper.getQueue(6);
        System.out.println("The raw Queue values: " + queue);
        System.out.println("The 'head' of the queue is: " + queue.peek());
        System.out.println("The 'size' of the queue before the poll: " + queue.size());
        System.out.println("If I 'poll' the queue, it shows what was the first object, and then removes it: " + queue.poll());
        System.out.println("The 'size' of the queue after the poll: " + queue.size());
        queue.add(0);
        System.out.println("If I add '0' back in the queue, it is headed toward the back of the line: " + queue);
        
        System.out.println("\n// Tree using TreeSet AND TreeMap");
        TreeSet treeSet = TreeHelper.getTreeSet();
        System.out.println("The raw TreeSet values: " + treeSet + " Notice how they're sorted! (and no duplicates!)");
        TreeMap treeMap = TreeHelper.getTreeMap();
        System.out.println("The raw TreeMap values: " + treeMap + " Notice how they're sorted too!");
        Set treeMapSet = treeMap.entrySet();
        Iterator iterator2 = treeMapSet.iterator();
        
        while(iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator2.next();
            System.out.println(entry.getKey() + " and its occurance in the alphabet is " + entry.getValue());
        }
        System.out.print("Used an iterator on this one because I captured it's entrySet.\n");
    }
    
}
