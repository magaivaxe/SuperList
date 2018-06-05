/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listNoeud;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author mpgsa
 * @param <T>
 */
public class LinkedChaine<T> {
    // Fields
    protected Noeud<T> start;
    protected Noeud<T> end;
    // No-parametric constructor 
    public LinkedChaine() {
        this.start = null;
    }
    // Parametric constructor 
    public LinkedChaine(T data) {
        start = new Noeud<>();
        start.setData(data);
    }
    // Parametric constructor
    public LinkedChaine(T [] arrayT) {
        // Instances
        start = new Noeud<>();
        end = new Noeud<>();
        // Locals
        Noeud<T> temp = new Noeud<>();
        // Loop to fill and construct the List
        for (int i = 0; i < arrayT.length; i++) {
            // condition to sign the temp and start
            if (start.getData() != null) {
                temp = start;
                end.setData(arrayT[i]);
                end.setBefore(temp.getAfter());
            }
            start.setData(arrayT[i]);
        }
        
    }
    
    
    
    public Object[] toArray(){
        // locals
        int size = 1;
        Object[] toReturn = new Object[size];
        
        return toReturn;
    }
    
    
    
    public T head(){
        T toReturn = null;
        
        return toReturn;
    }
    
    public T end(){
        T toReturn = null;
        
        return toReturn;
    }
    
    public LinkedChaine<T> tail(){
        LinkedChaine<T> lc = new LinkedChaine<>();
        
        return lc;
    }
    
    public void append (T e){
        
    }
    
    public int size (){
        int toReturn = 0;
        
        return toReturn;
    }
    
    
}
