/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CHRISHATAKE
 */
public class TDAarrylist2 {
    
    
    public static void main(String[] args)
    {
        //ArrayList <String> fraces=new ArrayList<String>;
        ArrayList <String> cadenas;//creando un objeto
        cadenas=new ArrayList<String>();
        String frase,respuesta;
        do{
            frase=JOptionPane.showInputDialog(null,"Ingresa una frace");
            //agrega la frace ala cadena
            cadenas.add(frase);
            respuesta=JOptionPane.showInputDialog(null,"Deseas ingresae otra frace");
           //para comvertilo en Mayusculas
            respuesta=respuesta.toUpperCase();
        }while(!respuesta.equals("NO"));
       //mostrando el contenido de cadenas
        //size el tamaño de la cadena
       for(int i=0;i<cadenas.size();i++)
       {
           
           System.out.println(cadenas.get(i));
           
       }
       //utilizando el metodo set
       cadenas.set(1, "La que modifique");
        System.out.println("Fraces modificadas");
       for(int i=0;i<cadenas.size();i++)
       {
           
           System.out.println(cadenas.get(i));
           
       }
       cadenas.remove(0);
       System.out.println("Fraces que nos quedan");
       for(int i=0;i<cadenas.size();i++)
       {
           
           System.out.println(cadenas.get(i));
           
       }
    }
}
