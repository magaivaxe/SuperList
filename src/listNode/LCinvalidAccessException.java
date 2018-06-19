/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listNode;

/**
 *
 * @author sire_marcos
 */
public class LCinvalidAccessException extends RuntimeException {
    // Fields
    int flag;
    Integer dataRec;
    // Constructors
    public LCinvalidAccessException() {}
    public LCinvalidAccessException(int flag, Integer dataRec) {
        super();
        this.flag = flag;
        this.dataRec = dataRec;
    }
    
    @Override
    public String getMessage(){
        String msg;
        switch (flag) {
            case 1: msg = "Invalid head() call: empty Linkedchaine";
                break;
            case 2: msg = "Invalid end() call: empty Linkedchaine";
                break;
            case 3: msg = "Invalid tail() call: empty Linkedchaine";
                break;
            case 4: 
                msg = "Invalid concat() call: "+
                      "empty Linkedchaine. size() = " + dataRec;
                break;
            case 5: msg = "Invalid next() call: hasNext() false";
                break;
            case 6: msg = "Invalid previous() call: hasPrevious() false";
                break;
            case 7: msg = "Invalid set(T v) cannot delete";
                break;
            case 8: msg = "Invalid remove() call: undefined current position";
                break;
            case 9: msg = "Invalid append() cannot append";
                break;
            default: msg = "Unknown invalid range flag";
                break;
        }
        return msg;
    }
}
