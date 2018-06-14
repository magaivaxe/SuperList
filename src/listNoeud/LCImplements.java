
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
     * Converts LinkedChaine to an array T[].
     * @return 
     */
    public Object[] toArray();
    
    /**
     * Return the LinkedChaine first element.
     * @return LinkedChaine.start.data;
     */
    public T listHead();
    
    /**
     * Returns the current object with start {@code Noeud<T>} = null.
     * @return LinkedChaine{@code <T>}
     */
    public LinkedChaine<T> listTail();
    
    /**
     * Return the LinkedChaine last element.
     * @return LinkedChaine.listEnd.data;
     */
    public T listEnd();
    
    /**
     * Add data element after the last LinkedChaine element 
     * @param data to add
     */
    public void append (T data);
    
    /**
     * Add a LinkedChaine {@code lc} to listEnd of this.
     * @param lc LinkedChaine object
     */
    public void concat (LinkedChaine<T> lc);
    
    /**
     * Iterator initializer.
     * @return a new LinkedChaineIterator{@code <T>}.
     */
    public LinkedChaineIterator<T> linkedChaineIterator();
}
