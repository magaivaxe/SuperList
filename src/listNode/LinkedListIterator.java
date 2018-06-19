
package listNode;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 
 * @author Marcos Gomes
 * @param <T> General type to access the private aggregated data and <br>
 * at same moment hiding the underlying representation.
 */
public class LinkedListIterator<T> implements Iterable<T>{
    // Fields
    private Node<T> nextNode;
    @SuppressWarnings("FieldMayBeFinal")
    private Node<T> currentNode;
    private LinkedList<T> linkedChaine;
    // Constructors

    public LinkedListIterator(LinkedList<T> linkedChaine) {
        this.linkedChaine = linkedChaine;
        this.currentNode = linkedChaine.getHead();
        this.nextNode = linkedChaine.getHead().next;
    }
    
    /**
     * Check if the next data from Node{@code <T>} exists.
     * @return boolean.
     */
    public boolean hasNext(){
        return (this.currentNode.next != null);
    }
    
    /**
     * Return the next value T from the linked Node{@code <T>}.
     * @return data from Node{@code <T>}.
     */
    public T next(){
        T res = nextNode.data;
        nextNode = nextNode.next;
        return res;
    }
    
    /**
     * Check if exists previous data from the currentNode.
     * @return boolean.
     */
    public boolean hasPrevious(){
        return (this.next() != null);
    }
    public T previous(){
        return null;
    }
    
    /**
     * Set data as value to currentNode {@code Node} data position
     * @param data T value to enter
     */
    public void set(T data){
        
    }
    
    /**
     * Add a {@code Node} with data value after currentNode position
     * @param data T value to enter
     */
    public void add (T data){
        
    }
    
    /**
     * Remove the currentNode {@code Node}
     */
    public void remove(T key){
        if()
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
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
