/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class Pincipal {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Incertar un elemento en la cola\n"
                        + "2.Quitar un elemento de la cola\n"
                        + "3.¿La cola esta vacia?\n"
                        + "4.Elemento ubicado en Inicio de la cola\n"
                        + "5.Tamaño de la cola\n"
                        + "6.Salir\n", "Menu de opciones de una Cola", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a insertar", "Insertando en la cola", JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento atendido es: " + colita.quitar(),
                                    "Quitando elemento de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia: ",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia: ",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia: ",
                                    "Cola no vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Elemento ubicado al inicio de l cola es: " + colita.inicioCola(),
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia: ",
                                    "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es: " + colita.tamanoCola(),
                                "Tamaño Cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada: ",
                                "fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta: ",
                                "¡Cuidado", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 6);
    }

}
