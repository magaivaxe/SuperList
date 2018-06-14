/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;


import listNoeud.LinkedChaine;
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
        LinkedChaine<Integer> testList = new LinkedChaine<>(testInt);
        
        // Test array contructor
        testPrint(testList);
        // Test listEnd() method
        System.out.println("End: " + testList.listEnd());
        // Test listSize()
        System.out.println("Size: " + testList.listSize());
        // Test listHead()
        System.out.println("Head: " + testList.listHead());
        // Test listTail()
        LinkedChaine<Integer> testTail = testList.listTail();
        testPrint(testTail);
    }

    private static void testPrint(LinkedChaine<Integer> lc) {
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
