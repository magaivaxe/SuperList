
package listNode;


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
        Node<T> temp = this.head.next;
        LinkedList<T> lc = new LinkedList<>(temp.data);
        lc.size = this.size - 1;
        // to read linkedList
        while (temp != null) {            
            // Condition to set end
            if (temp.next == null) {
                lc.end = temp;
            }
            // Loop incrementation
            temp = temp.next;
        }
        return lc;
    }
    
    @Override
    public void append (T data){
        // If it is void
        if (this.head == null){
            this.head = new Node<>(data, null);
            this.size++;
        }else{
            // Temp to read and incrementation
            Node<T> temp = this.head;
            // Loop to read Node by Node
            while (temp.next != null) {
                // Incrementation
                temp = temp.next;
            }
            temp.next = new Node<T>(data, null);
            this.size++;
            this.end = temp.next;
        }
    }
    
    @Override
    public void concat(LinkedList<T> lc) throws LCinvalidAccessException{
        if (lc.head == null) {
            throw new LCinvalidAccessException(4, null);
        }else{
            // Temp to read and incrementaion
            Node<T> temp = this.head;
            // Loop to read
            while (temp.next != null) {                
                temp = temp.next;
            }
            Node<T> tempLC = lc.head;
            // Contatenation
            temp.next = lc.head;
            // New size
            this.size += lc.size;
            this.end = lc.end;
        }
    }
    

    @Override
    public LinkedListIterator<T> linkedChaineIterator() {
        LinkedListIterator<T> lci = new LinkedListIterator<>(this);
        return lci;
    }

    public Node<T> getHead() {
        return head;
    }

}
    // =========================================================================
    
    
