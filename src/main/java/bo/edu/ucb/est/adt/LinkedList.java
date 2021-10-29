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
        if(first==null)
        {
            first=newNode;
            size++;
        }
        else
        {
            Node<D> currentAux=first;
            int Aux=0;
            for(Node<D> current=first;current!=null;current=current.getNext())
            {
                D DataAux=current.getData();
                if(DataAux.compareTo(data)>=1)
                {
                    if(current==first)
                    {
                        newNode.setNext(current);
                        first=newNode;
                    }
                    else
                    {
                        newNode.setNext(current);
                        currentAux.setNext(newNode);
                    }
                    size++;
                    break;
                }
                if(current.getNext()==null)
                {
                    current.setNext(newNode);
                    size++;
                    break; 
                }
                if(Aux==0)
                {
                    Aux=1;
                }
                else
                {
                    currentAux=currentAux.getNext();
                }
            }
        }
    }
    //retorna el elemnto en la posicion index, comenxando en 0(first)
    //si el size de la lista es por ejemplo 3 y se envia index=3 el programa debe terminar 
    // con un RuntimeException que diga (indice mayor al tamano de la lista)
    public D get (int index){
        if(index<(size-1))
        {
            int aux=0;
            Node<D> Data=null;
            for (Node<D> current = first;current != null; current = current.getNext() ) {
                    if (aux == index) {
                        Data=current;
                        break;
                    }
                    aux++;
                }
            return (D)Data.getData();
        }
        else
        {
            throw new RuntimeException("Índice mayor al tamaño de la lista");
        }
        
    }
    //imprimir
    public void print(){
        for (Node<D> current = first; current != null ; current = current.getNext()) {
           System.out.print( current.getData() + " -> ");
       } 
       System.out.println(" |. ");
    }
    // elimina el dato D si ya existe. si no existe no hace nada
    public void delete (D d){
        Node<D> PreviousNode=null;
        size--;
        if(first.getData().equals(d))
        {
            first=first.getNext();
           
        }
        else
        {
            for(Node<D> current=first; current!=null; current=current.getNext())
            {
                if(current.getData().equals(d))
                {
                    PreviousNode.setNext(current.getNext());
                    break;
                }
                PreviousNode=current;
            }
        }
    }
    public void test(D data, D otherData)
    {
        System.out.println(data.compareTo(otherData));
    }
}
