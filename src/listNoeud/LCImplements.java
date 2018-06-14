
package listNoeud;


/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public interface LCImplements<T> {
    
    /**
     * Converts LinkedChaine to an array T[].
     * @return 
     */
    public Object[] toArray();
    
    /**
     * Return the LinkedChaine first element.
     * @return LinkedChaine.start.data;
     */
    public T head();
    
    /**
     * Returns the current object with start {@code Noeud<T>} = null.
     * @return LinkedChaine{@code <T>}
     */
    public LinkedChaine<T> tail();
    
    /**
     * Return the LinkedChaine last element.
     * @return LinkedChaine.end.data;
     */
    public T end();
    
    /**
     * Add data element after the last LinkedChaine element 
     * @param data to add
     */
    public void append (T data);
    
    /**
     * Add a LinkedChaine {@code lc} to end of this.
     * @param lc LinkedChaine object
     */
    public void concat (LinkedChaine<T> lc);
    
    /**
     * Iterator initializer.
     * @return a new LinkedChaineIterator{@code <T>}.
     */
    public LinkedChaineIterator<T> linkedChaineIterator();
}
