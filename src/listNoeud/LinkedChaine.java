
package listNoeud;


/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public class LinkedChaine<T> {
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
    
    
    
    public Object[] toArray(){
        // locals
        Object[] toReturn = new Object[size];
        
        return toReturn;
    }
    
    public T head(){return start.getData();}
    
    public T end(){return end.getData();}
    
    public LinkedChaine<T> tail(){
        LinkedChaine<T> lc = new LinkedChaine<>();
        
        return lc;
    }
    
    public void append (T e){
        
    }
    
    public int listSize(){return this.size;}

}
