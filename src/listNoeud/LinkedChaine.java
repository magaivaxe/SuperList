
package listNoeud;


/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public class LinkedChaine<T> implements LCImplements<T>{
    // Fields
    protected Noeud<T> start;
    protected Noeud<T> end;
    private int size;
    // No-parametric constructor 
    public LinkedChaine() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }
    // Parametric constructor 
    public LinkedChaine(T data) {
        this.start = new Noeud<>();
        this.start.setData(data);
        this.end = this.start;
        this.size = 1;
    }
    
    /**
     * Parametric constructor that it will receive T [] arrayT to convert it<br>
     * into a LinkedChaine with size equal to array length.
     * @param arrayT 
     */
    public LinkedChaine(T [] arrayT) {
        // Instances
        this.start = new Noeud<>();
        this.end = new Noeud<>();
        this.size = 0;
        // Loop to fill and construct the List
        for (int i = 0; i < arrayT.length; i++) {
            Noeud<T> temp = new Noeud<>();
            // Head value
            if (start.getData() == null) {
                start.setData(arrayT[i]);
            } else {
                temp = end;
                // Set the next data to the end
                end.setData(arrayT[i]);
                // Link the end to the cycle first value 
                end.setBefore(temp.getAfter());
            }
            // Temp value to next cycle
            end.setData(arrayT[i]);
            this.size++;
        }
    }
    
    public int listSize(){return this.size;}
    
    @Override
    @SuppressWarnings("SuspiciousSystemArraycopy")
    public Object[] toArray(){
        Object[] toReturn = new Object[size];
        System.arraycopy(this, 0, toReturn, 0, this.size);
        return toReturn;
    }
    
    @Override
    public T head(){return start.getData();}
    
    @Override
    public T end(){return end.getData();}
    
    @Override
    public LinkedChaine<T> tail() throws LCinvalidAccessException{
        if (this.start != null) { 
            LinkedChaine<T> lc = new LinkedChaine<>();
            lc = this;
            lc.start.setData(null);
            lc.size--;
            return lc;
        } else {
            throw new LCinvalidAccessException(3, 0);
        }
    }
    
    @Override
    @SuppressWarnings("SuspiciousSystemArraycopy")
    public void append (T data) throws LCinvalidAccessException{
        if (data != null){
            LinkedChaine<T> lc = new LinkedChaine<>(data);
            System.arraycopy(lc, 0, this, size, lc.size);
        }else{
            throw new LCinvalidAccessException(size, null);
        }
        
    }
    
    @Override
    @SuppressWarnings("SuspiciousSystemArraycopy")
    public void concat(LinkedChaine<T> lc) throws LCinvalidAccessException{
        if (lc.start != null) {
            System.arraycopy(lc, 0, this, size, lc.size);
        }else{
            throw new LCinvalidAccessException(4, null);
        }
        
    }

    @Override
    public LinkedChaineIterator<T> linkedChaineIterator() {
        LinkedChaineIterator<T> lci = new LinkedChaineIterator<>(this);
        return lci;
    }

}
