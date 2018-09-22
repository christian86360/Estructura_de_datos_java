/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "1.Agregar un Elemento ala lista\n2.Agregar un elemento al final\n"
                        + "3.Mostrar los datos de la lista\n "
                        +  "4.Eliminar un elemento del inicio de la lista\n"
                        + "5.Eliminar un elemento de final de la lista\n"
                        + "6.Eliminar un elemto en especifico\n"
                        + "7.Buscar un elemento en la lista\n"        
                        + "8.salir", "Menu de opciones", 3));
                switch (opcion) {
                    case 1:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa elemento:",
                                    "Incertando al Inicio", 3));
                            //agregando al nodo
                            lista.agregarAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showInputDialog(null, "Error" + n.getMessage());
                        }

                        break;

                    case 2:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa elemento:",
                                    "Incertando al Final", 3));
                            //agregando al nodo
                            lista.agregarAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showInputDialog(null, "Error" + n.getMessage());
                        }

                        break;
                    case 3:
                        lista.mostrarLista();
                        break;
                    case 4:
                        el = lista.borrarDelInicio();
                        JOptionPane.showInputDialog(null, "Elemento elimidado es" + el
                                + " Eliminando Nodo del inicio " + JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        el = lista.borrarDelFinal();
                        JOptionPane.showInputDialog(null, "Elemento elimidado es" + el
                                + " Eliminando Nodo del final " + JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingres el dato a eliminar","Eliminando Nodos en especifico",JOptionPane.INFORMATION_MESSAGE));
                           if(lista.estaEnlaLista(el)){
                           lista.eliminarNodo(el);
                        JOptionPane.showInputDialog(null,"El elemento eliminado es: "+el+ " Nodo eliminado ",JOptionPane.INFORMATION_MESSAGE);
                        
                            
                        }else{
                               JOptionPane.showInputDialog(null,"Elemento "+el+ " Eliminando Nodos en especifico");
                           }
                          
                        break;
                    case 7:
                          el = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el elemento a buscar.....","Buscando Nodos en la lista",
                                JOptionPane.INFORMATION_MESSAGE));
                          if(lista.estaEnlaLista(el)==true){
                              JOptionPane.showInputDialog(null,"El elemento "+el+" Si esta en la lista"+
                                      "Nodo encontrado",JOptionPane.INFORMATION_MESSAGE);
                          }else{
                              JOptionPane.showInputDialog(null,"El elemento "+el+" No esta en la lista"+
                                      "Nodo no encontrado",JOptionPane.INFORMATION_MESSAGE);
                          }
                        break;
                        
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa finalisado");
                      
                        
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opcion incorreta");
                }
            } catch (Exception e) {
                JOptionPane.showInputDialog(null, "Error" + e.getMessage());

            }
        } while (opcion != 8);
    }

}
