/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.adt;

/**
 *
 * @author HP
 */
public class Node <D> {
    private D data;
    private Node<D> next;
    public Node (D data, Node<D> next)
    {
        this.data = data;
        this.next = next; 
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> next) {
        this.next = next;
    }
    
}
