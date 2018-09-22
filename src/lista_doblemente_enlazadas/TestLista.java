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
public class TestLista {

    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo al Inicio\n"
                        + "2.Agregar un Nodo al Final\n"
                        + "3.Mostrar la Lista de Inicio a Fin\n"
                        + "4.Mostrar la lista de fi a Inicio\n"
                        + "5.Eliminar un Nodo del Inicio\n"
                        + "6.Eliminar un nodo del Final\n"
                        + "7.Salir\n"
                        + "Que deseas hacer?", "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al Inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.agragarAInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al Final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.agragarAlFinal(elemento);
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaInicioFin();

                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaFinInicio();

                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                       if(!listita.estaVacia()){
                           elemento=listita.eliminarDelInicio();
                           JOptionPane.showMessageDialog(null,"El elemento eliminado es:"+elemento, 
                               "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
                       }else{
                           JOptionPane.showMessageDialog(null,"No hay Nodos aun", 
                               "Eliminando Nodo del Inicio",JOptionPane.INFORMATION_MESSAGE );
                       }
                       
                        break;

                    case 6:
                        if(!listita.estaVacia()){
                           elemento=listita.eliminarDelFinal();
                           JOptionPane.showMessageDialog(null,"El elemento eliminado es:"+elemento, 
                               "Eliminando Nodo del Final",JOptionPane.INFORMATION_MESSAGE );
                       }else{
                           JOptionPane.showMessageDialog(null,"No hay Nodos aun", 
                               "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
                       }
                        break;
                    case 7:
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

        } while (opcion != 7);

    }

}
