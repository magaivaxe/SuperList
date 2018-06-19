/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;


import listNode.LinkedList;
import listNode.Node;

/**
 *
 * @author Marcos Paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer [] testInt = new Integer[]{0,1,2,3,4,5,6,7,8,9};
        Integer [] newTestInt = new Integer[]{30,40,30,20,44,55,66,7,98};
        LinkedList<Integer> testList = new LinkedList<>(testInt);
        LinkedList<Integer> newList = new LinkedList<>(newTestInt);
        
        // Test array contructor    OK
        System.out.println("test List ------------------");
        testPrint(testList);
        // Test listEnd() method    OK
        System.out.println("End: " + testList.listEnd());
        // Test listSize()          OK
        System.out.println("Size: " + testList.listSize());
        // Test listHead()          OK
        System.out.println("Head: " + testList.listHead());
        
        // Test listTail()          OK
        System.out.println("Test tail ------------------");
        LinkedList<Integer> testTail = testList.listTail();
        System.out.println("Head " + testTail.getHead().getData() + 
                "\nEnd: " + testTail.listEnd());
        System.out.println("Tail size: " + testTail.listSize());
        
        // Test append data         OK
        System.out.println("Test Append ------------------");
        Integer dataToAppend = 50;
        testList.append(dataToAppend);
        testPrint(testList);
        System.out.println("EndChanged: " + testList.listEnd());
        System.out.println("SizeChanged: " + testList.listSize());
        
        // Test concat              OK
        System.out.println("Test Concat ------------------");
        testList.concat(newList);
        testPrint(testList);
        System.out.println("EndChanged: " + testList.listEnd());
        System.out.println("SizeChanged: " + testList.listSize());
    }

    private static void testPrint(LinkedList<Integer> lc) {
        Node<Integer> temp = lc.getHead();
        while (temp != null) {            
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        if (temp.getNext() == null) {
            System.out.println(temp.getData());
        }
    }
    
}
