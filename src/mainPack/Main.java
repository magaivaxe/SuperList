/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import listNoeud.LinkedChaine;

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
        
        testPrint(testList);
    }

    private static void testPrint(LinkedChaine<Integer> lc) {
        Integer[] test = (Integer[]) lc.toArray();
        for (int i = 0; i < lc.listSize(); i++) {
            System.out.println(test[i]);
        }
        
    }
    
}
