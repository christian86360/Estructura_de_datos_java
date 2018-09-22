/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doblemente_enlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    //Metodo para saber cuando la lista esta basia
    public boolean estaVacia() {
        return inicio == null;

    }

    //Metodo para agregar Nodos al final
    public void agragarAlFinal(int el) {
        if (!estaVacia()) {
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para agregar al inicio
    public void agragarAInicio(int el) {
        if (!estaVacia()) {
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
                JOptionPane.showInputDialog(null, datos,
                        "Mostrando Lista de inicio a fin",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
        //Metodo para mostrar la lista de fin a inicio
        
    }
    //Metodo para mostrar la lista de fin a inicio
     public void mostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
                JOptionPane.showInputDialog(null, datos,
                        "Mostrando Lista de inicio a fin",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }

}
     //metodo para eliminar del inicio
     public int eliminarDelInicio(){
         int elemento=inicio.dato;
         if(inicio==fin){
             inicio=fin=null;
         }else{
             inicio=inicio.siguiente;
             inicio.anterior=null;
         }
         return elemento;
     }
     //Para eliminar del final
     public int eliminarDelFinal(){
           int elemento=fin.dato;
         if(inicio==fin){
             inicio=fin=null;
         }else{
            fin=fin.anterior;
            fin.siguiente=null;
         }
         return elemento;
         
     }
}
