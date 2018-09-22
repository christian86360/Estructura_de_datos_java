/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlazadas;

/**
 *
 * @author CHRISHATAKE
 */
public class Nodo {

    public int dato;
    public Nodo siguiente;//puntero enlase
//constructor para incertar al final
    public Nodo(int d) {

        this.dato = d;
        this.siguiente=null;
    }
    //constructor para insertar al inicio
public Nodo(int d,Nodo n){
    dato=d;
    siguiente=n;
    
}
}
