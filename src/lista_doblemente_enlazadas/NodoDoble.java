/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doblemente_enlazadas;

/**
 *
 * @author CHRISHATAKE
 */
public class NodoDoble {
    
    public int dato;
    NodoDoble siguiente,anterior;
    //para cuando no hay nodos
    public NodoDoble(int el){
        this(el,null,null);
    }
    //constructor para cuando hay nodo
    public NodoDoble(int el, NodoDoble s,NodoDoble a){
        dato=el;
        siguiente=s;
        anterior=a;
        
        
    }
    
    
    
}
