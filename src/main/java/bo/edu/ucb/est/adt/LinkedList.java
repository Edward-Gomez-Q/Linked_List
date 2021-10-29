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
// solo aceptar D que acepten el contrato
public class LinkedList<D extends Comparable>{
    private Node<D> first;
    private int size;
    public LinkedList (){
        size=0;
        first =null;
    }
    // Agrega el dato enviado a la lista de forma ordenada de menor a mayor
    // Dato enviado, debe cumplir con el contrato Comparable
    public void add (D data){
        Node<D> newNode = new Node<> (data,null);
    }
    //retorna el elemnto en la posicion index, comenxando en 0(first)
    //si el size de la lista es por ejemplo 3 y se envia index=3 el programa debe terminar 
    // con un RuntimeException que diga (indice mayor al tamano de la lista)
    public D get (int index){   
        return null;
    }
    //imprimir
    public void print(){
    
    }
    // elimina el dato D si ya existe. si no existe no hace nada
    public void delete (D d){
    
    }
    public void test(D data, D otherData)
    {
        System.out.println(data.compareTo(otherData));
    }
}
