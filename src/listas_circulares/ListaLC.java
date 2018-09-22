/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class ListaLC {

    NodoLC ultimo;

    public ListaLC() {
        ultimo = null;

    }

    //Metodo para saber cuando la lista esta basia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar nodos
    public ListaLC intsertar(int elemento) {
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;

        return this;
    }

    //Metodo para mostrar la lista
    public void mostrarLista() {
        NodoLC auxiliar = ultimo.siguiente;
        String cadena="";
        
        do{
            cadena=cadena+"["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
            
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando La Lista Circula",JOptionPane.INFORMATION_MESSAGE);
        
    }
    //Metodo para eliminar un Nodo de la lista simple
    public boolean eliminar(int elemento){
        NodoLC actual;
        boolean encontrado =false;
        actual=ultimo;
        while(actual.siguiente!=ultimo && ! encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.dato==elemento);
        if(encontrado){
            NodoLC auxiliar=actual.siguiente;
            if(ultimo==ultimo.siguiente){
                ultimo=null;
            }else{
                if(auxiliar==ultimo){
                    ultimo=actual;
                }
                actual.siguiente=auxiliar.siguiente;
            }
            auxiliar=null;
        }
        return encontrado==true;
    } 
}
