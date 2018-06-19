package listNode;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Class to iterate with a currentHead from a LinkedList
 * @author Marcos Gomes
 * @param <T> General type to access the private aggregated data and <br>
 * at same moment hiding the underlying representation.
 */
class LinkedListIterator<T> implements Iterable<T>{
    // Fields
    private Node<T> currentHead;
    private LinkedList<T> linkedList;
    // Constructors
    public LinkedListIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
        this.currentHead = linkedList.getHead();
    }
    
    /**
     * Check if the next data from Node{@code <T>} exists.
     * @return boolean.
     */
    public boolean hasNext(){
        return (this.currentHead.next != null);
    }
    
    /**
     * Return the next value T from the linked Node{@code <T>}.
     * @return data from Node{@code <T>}.
     */
    public T next(){
        T data = currentHead.data;
        currentHead = currentHead.next;
        return data;
    }
    
    /**
     * Check if exists previous data from the currentHead.
     * @return boolean.
     */
    public boolean hasPrevious(){
        if (currentHead == null) {
            return false;
        }
        Node<T> temp = currentHead;
        // Condition to hasPrevious
        return (temp.next != null);
    }
    
    // I don't known do this method
    public T previous(){
        return null;
    }
    
    /**
     * Set data as value to currentHead {@code Node} data position
     * @param data T value to enter
     */
    public void set(T data){
        Node<T> temp = new Node<>(data, currentHead.next);
        currentHead = temp;
        linkedList.setSizePlusOne();
    }
    
    /**
     * Add a {@code Node} with data value after currentHead position
     * @param data T value to enter
     */
    public void add (T data){
        if (currentHead == null) throw new LCinvalidAccessException(9, 0);
        T currData = currentHead.data;
        Node<T> newNext = new Node<>(data, currentHead.next);
        Node<T> tempHead = new Node<>(currData, newNext);
        currentHead = tempHead;
        linkedList.setSizePlusOne();
    }
    
    /**
     * Remove the currentHead {@code Node}
     * @param key
     */
    public void remove(T key){
        // Check if the Node exists
        if(currentHead == null){
            throw new LCinvalidAccessException(7, 0);
        }
        // Remove the head by assign equals to next
        if (currentHead.data.equals(key)) {
            currentHead = currentHead.next;
            linkedList.setSizeMinusOne();
            return;
        }
        // Temporaries Nodes to loop
        Node<T> curr = currentHead;
        Node<T> prev = null;
        // Loop to check and find the key data
        while (curr != null && !curr.data.equals(key)) {            
            prev = curr;
            curr = curr.next;
        }
        // Exception to delete
        if (curr == null) throw new LCinvalidAccessException(7, 0);
        /*
        Remove the curr node. It is used prev.next to remove because the 
        last curr analysed is curr.next on while loop
        */
        prev.next = curr.next;
        linkedList.setSizeMinusOne();
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new LinkedListIterator<>(linkedList);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); 
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator(); 
    }
   
}
