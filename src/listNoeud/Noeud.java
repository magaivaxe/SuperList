/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listNoeud;

/**
 *
 * @author Marcos Gomes
 * @param <T>
 */
public class Noeud<T>{
    // Fields
    private Noeud<T> before;
    private T data;
    private Noeud<T> after;
    // Contructor
    protected Noeud() {}

    // Setters and getters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Noeud<T> getBefore() {
        return before;
    }

    public void setBefore(Noeud<T> content) {
        this.before = content;
    }

    public Noeud<T> getAfter() {
        return after;
    }

    public void setAfter(Noeud<T> next) {
        this.after = next;
    }
    
    
    
}
