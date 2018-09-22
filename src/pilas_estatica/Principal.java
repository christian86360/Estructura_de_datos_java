/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_estatica;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class Principal {

    public static void main(String[] args) {

        int opcion = 0, elemento, tamanio;
        boolean estado=false;
              
        try {
           tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿De que tamaño quieres la Pila?",
                    "Solicitando el tamaño de la pila",
                    JOptionPane.INFORMATION_MESSAGE));
            Pila pilita = new Pila(tamanio);
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Empujar un elemento de la pila\n"
                        + "2.Sacar un elemento de la Pila\n"
                        + "3.¿La Pila esta Vacia?\n"
                        + "4.¿La Pila esta Llena\n"
                        + "5.¿Que elemento esta en la Cima?\n"
                        + "6.Tamaño de la Pila\n"
                        + "7.Limpiar Pila\n"        
                        + "8.Salit\n"
                        + "Que deceas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento= Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Ingresa ele elemento a en pujar?",
                    "Apilando",
                    JOptionPane.INFORMATION_MESSAGE));
                        if(!pilita.estaLlena()){
                            pilita.empujar(tamanio);
                        }else{
                     JOptionPane.showInputDialog(null,
                    "¿La Pila esta llena?",
                    "Pila Lena",
                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(!pilita.estaVacia()){
                    JOptionPane.showInputDialog(null,
                    "El elemento octenido es:"+pilita.sacar(),
                    "Opteniendo datos de la pila",
                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showInputDialog(null,
                    "¿La Pila esta vacia?",
                    "Pila vacia",
                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(pilita.estaVacia()){
                            JOptionPane.showInputDialog(null,
                    "¿La Pila esta vacia?",
                    "Pila vacia",
                    JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                            JOptionPane.showInputDialog(null,
                    "La Pila no esta vacia",
                    "La pila contiene datos",
                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                           if(pilita.estaLlena()){
                            JOptionPane.showInputDialog(null,
                    "La Pila esta llena",
                    "Pila llena",
                    JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                            JOptionPane.showInputDialog(null,
                    "La Pila todabia tiene espacio",
                    "La pila tiene espacio",
                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 5:
                        if(!pilita.estaVacia()){
                             JOptionPane.showInputDialog(null,
                    "El elemento que se en cuentra en la cima es: "+
                    pilita.cimaPila(),
                    "Cima de la pila",
                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showInputDialog(null,
                    "La Pila esta vavia",
                    "Pila vacia",
                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                         JOptionPane.showInputDialog(null,
                    "El tamaño de la pila es "+pilita.tamanoPla(),
                    "tamaño de la pila",
                    JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        pilita.limpiarPila();
                         JOptionPane.showMessageDialog(null,"Pila vacia",
                                "Vacia",JOptionPane.INFORMATION_MESSAGE);
                  
                            
                
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null,"Aplicacion finalizada",
                                "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta",
                                "Error",JOptionPane.INFORMATION_MESSAGE);
                }

            } while (opcion != 7);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
        }
    }

}
