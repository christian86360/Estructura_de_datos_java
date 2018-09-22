/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author CHRISHATAKE
 */
public class TDAarrays {


public static void main(String[] args)
{
    int numeros[]=new int [5];
    String palabras[]=new String[5];
    int i;
    for(i=0;i<5;i++)
    {
        numeros[i]=Integer.parseInt
        (JOptionPane.showInputDialog(null, "Ingresa unos datos"+i));
    }
    //mostrando los datos
    System.out.println("Los datos sin ordenar son");
    for( i=0;i<5;i++){
        System.out.println("["+numeros[i]+"]");
    }
    System.out.println("Los datos Ordenados son");
  Arrays.sort(numeros);//a qui oderna los datos
  for( i=0;i<5;i++)
  {
        System.out.println("["+numeros[i]+"]");
  }
  //rellenando al arreglo palabras
  Arrays.fill(palabras, "bienvenido ala fiesta");
    System.out.println("elementos del arreglo palabras");
    for(i=0;i<5;i++){
         System.out.println("["+palabras[i]+"]");
    }
  
}
}
