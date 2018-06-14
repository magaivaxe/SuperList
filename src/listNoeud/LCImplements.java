
package listNoeud;


/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public interface LCImplements<T> {
    
    /**
     * Return the size list
     * @return integer size list
     */
    public int listSize();
    
    /**
     * Converts LinkedList to an array T[].
     * @return 
     */
    public Object[] toArray();
    
    /**
     * Return the LinkedList first element.
     * @return LinkedList.start.data;
     */
    public T listHead();
    
    /**
     * Returns the current object with start {@code Noeud<T>} = null.
     * @return LinkedList{@code <T>}
     */
    public LinkedList<T> listTail();
    
    /**
     * Return the LinkedList last element.
     * @return LinkedList.listEnd.data;
     */
    public T listEnd();
    
    /**
     * Add data element after the last LinkedList element 
     * @param data to add
     */
    public void append (T data);
    
    /**
     * Add a LinkedList {@code lc} to listEnd of this.
     * @param lc LinkedList object
     */
    public void concat (LinkedList<T> lc);
    
    /**
     * Iterator initializer.
     * @return a new LinkedChaineIterator{@code <T>}.
     */
    public LinkedChaineIterator<T> linkedChaineIterator();
}
