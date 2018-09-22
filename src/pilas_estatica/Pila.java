/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_estatica;

/**
 *
 * @author CHRISHATAKE
 */
public class Pila {
    int vectorPila[];
    int cima;
    //constructor
    public Pila(int tamanio){
        vectorPila=new int[tamanio];
        cima=1;
    }
    //Metodo push
    public void empujar(int dato){
        cima++;
        vectorPila[cima]=dato;
    }
    //Metodo pop
    public int sacar(){
        int fuera=vectorPila[cima];
        cima--;
        return fuera;
    }
    //Metodo para saber si la pila esta basia
    public boolean estaVacia(){
        return cima==-1;
    }
    //Metodo cuando la pila es ta llena
    public boolean estaLlena(){
        return vectorPila.length-1==cima;
    }
    //Metodo para saber que elemento se encuentra en la sima
    public int cimaPila(){
        return vectorPila[cima];
    }
    //Metodo para saber el tamaño de la pila
   public int tamanoPla(){
       return vectorPila.length;
   }
   //Limpiar pila
   public void limpiarPila(){
       while(!estaVacia()){
           sacar();
       }
   }
  
}
