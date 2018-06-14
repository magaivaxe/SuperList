/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listNode;

/**
* Internal class to be access uniquely by LinkChaine
* @author Marcos Gomes
* @param <T> General type to object assign
*/
public class Node<T>{
    // Fields
    protected T data;
    protected Node<T> next;
    // Contructor
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
    
}

