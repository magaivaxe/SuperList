
package listNoeud;


/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public class LinkedList<T> implements LCImplements<T>{
    // Fields
    private Node<T> head;
    private Node<T> end;
    private int size;
    // No-parametric constructor 
    public LinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }
    // Parametric constructor 
    public LinkedList(T data) {
        this.head = new Node<>(data, null);
        this.size = 1;
    }
    
    /**
     * Parametric constructor that it will receive T [] arrayT to convert it<br>
     * into a LinkedChaine with size equal to array length.
     * @param arrayT 
     */
    public LinkedList(T [] arrayT) {
        // Instances
        this.size = 0;
        // Head value
        head = new Node<>(arrayT[0], null);
        this.size++;
        Node<T> temp = head;
        // Loop to fill and construct the List
        for (int i = 1; i < arrayT.length; i++) {
            if (temp.next == null) {
                temp.next = new Node<>(arrayT[i], null);
            }
            temp = temp.next;
            this.size++;
            // The last assign
            if (i == arrayT.length - 1) {
                end = temp;
            }
        }
    }
    
    @Override
    public int listSize(){return this.size;}
    
    @Override
    public T listHead(){return head.data;}
    
    @Override
    public T listEnd(){return end.data;}
    
    @Override
    public Object[] toArray(){
        
        return null;
    }
    
    @Override
    public LinkedList<T> listTail() {
        // initial node on head.next
        Node<T> tempThis = head;
        LinkedList<T> lc = new LinkedList<>(head.next.data);
        lc.size = this.size - 1;
        // loop to fill
        while (tempThis.next != null) {
            
            lc.head.next = new Node<>(tempThis.next.data, tempThis.next);
            //Incrementation
            tempThis = tempThis.next;
            lc.head = lc.head.next;
            // Exit condition
            if (tempThis.next == null) {
                lc.end = tempThis;
                break;
            }
        }
        return lc;
    }
    
    @Override
    public void append (T data) throws LCinvalidAccessException{
        if (head == null){
            head = new Node<T>(data, head);
        }else{
            Node<T> temp = head;
            while (temp.next != null) {                
                temp = temp.next;
            }
            temp.next = new Node<T>(data, null);
        }
        
    }
    
    @Override
    public void concat(LinkedList<T> lc) throws LCinvalidAccessException{
        if (lc.head != null) {
            
        }else{
            throw new LCinvalidAccessException(4, null);
        }
    }
    

    @Override
    public LinkedChaineIterator<T> linkedChaineIterator() {
        LinkedChaineIterator<T> lci = new LinkedChaineIterator<>(this);
        return lci;
    }

    public Node<T> getHead() {
        return head;
    }

}
    // =========================================================================
    
    

