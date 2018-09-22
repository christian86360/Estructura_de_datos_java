/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares;

import javax.swing.JOptionPane;
import lista_doblemente_enlazadas.ListaDoble;

/**
 *
 * @author CHRISHATAKE
 */
public class Principal {
    public static void main(String[] args){
         ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado=false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo al Inicio\n"
                        + "2.Eliminar un Nodo de la Lista Circular\n"
                        + "3.Mostrar los Datos de la Lista Circular\n"
                        + "4.Salir\n"
                        + "Que deseas hacer?", "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Ingresa el elemento del Nodo a Eliminar", "Eliminando Nodo",
                              JOptionPane.INFORMATION_MESSAGE));
                        listita.intsertar(elemento);
                      
                        break;
                    case 2:
                        if(listita.estaVacia()){
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Ingresa el elemento del Nodo", "Agregando Nodo ala lista Circular",
                              JOptionPane.INFORMATION_MESSAGE));
                       eliminado=listita.eliminar(elemento);
                       if(eliminado){
                           JOptionPane.showInputDialog(null,
                              "Elemento eliminado es: "+elemento,
                              "Eliminando Nodos",JOptionPane.INFORMATION_MESSAGE);
                           
                       }else{
                          JOptionPane.showInputDialog(null,
                              "Elemento: "+elemento,
                              "No encontrado",JOptionPane.INFORMATION_MESSAGE);
                           
                       }
                        }else{
                             JOptionPane.showInputDialog(null,
                              "No hay nodos: ",
                              "La lista esta vacia",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
            
                        
                        
                        break;
                    case 3:
                       if(!listita.estaVacia()){
                           listita.mostrarLista();
                       }else{
                           JOptionPane.showMessageDialog(null,"No hay Nodos aun", 
                               "Lista vacia",JOptionPane.INFORMATION_MESSAGE );
                       }
                       break;
                    
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el Menu",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (NullPointerException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 4);

    }
        
    
}
