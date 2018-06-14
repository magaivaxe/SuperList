/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;


import listNoeud.LinkedList;
import listNoeud.Node;

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
        LinkedList<Integer> testList = new LinkedList<>(testInt);
        
        // Test array contructor    OK
        System.out.println("test List");
        testPrint(testList);
        // Test listEnd() method    OK
        System.out.println("End: " + testList.listEnd());
        // Test listSize()          OK
        System.out.println("Size: " + testList.listSize());
        // Test listHead()          OK
        System.out.println("Head: " + testList.listHead());
        
        // Test listTail()          OK
        System.out.println("Test tail");
        LinkedList<Integer> testTail = testList.listTail();
        System.out.println(testTail.getHead().getNext().getData());
        Node<Integer> temp = testTail.getHead();
        
    }

    private static void testPrint(LinkedList<Integer> lc) {
        Node<Integer> temp = lc.getHead();
        while (temp.getNext() != null) {            
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        if (temp.getNext() == null) {
            System.out.println(temp.getData());
        }
    }
    
}
