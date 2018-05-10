/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionHelpers;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Kevin's Account
 */
public class TreeHelper {
    public static TreeSet getTreeSet() {
        TreeSet treeSet = new TreeSet();
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("C");
        
        return treeSet;
    }
    
    public static TreeMap getTreeMap() {
        TreeMap treeMap = new TreeMap();
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        
        return treeMap;
    }
    
}
