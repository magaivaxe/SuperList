/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listNoeud;

import java.util.Iterator;

/**
 *
 * @author Marcos Gomes
 */
public class LinkedChaineIterator<T> implements Iterable<T>{
    // Fields
    private Node<T> next;
    private Node<T> current;
    private LinkedChaine<T> linkedChaine;
    // Constructors

    public LinkedChaineIterator(LinkedChaine<T> linkedChaine) {
        this.linkedChaine = linkedChaine;
    }
    
    public boolean hasNext(){
        return false;
    }
    public T next(){
        return null;
    }
    public boolean hasPrevious(){
        return false;
    }
    public T previous(){
        return null;
    }
    
    /**
     * Set data as value to current {@code Node} data
     * @param data T value to enter
     */
    public void set(T data){
        
    }
    
    /**
     * Add a {@code Node} with data value after current position
     * @param data T value to enter
     */
    public void add (T data){
        
    }
    
    /**
     * Remove the current {@code Node}
     */
    public void remove(){
        
    }
    
    @Override
    public Iterator<T> iterator() {
        return null;
    }
    
}
