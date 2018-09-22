/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author LugoMaroquin
 */
public class BusquedaSecuencial {

    public int busquedaSecuencial(int arreglo[], int elemento) {
        int i;
        boolean encontrado = false;
        for (i = 0; i < arreglo.length && encontrado == false; i++) {
          if(elemento==arreglo[i]){
              encontrado=true;
              return i;
          }
        }
        return -1;
    }
    public void MostrarArreglo(int[]arreglo){
        int k;
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
   BusquedaSecuencial bus=new BusquedaSecuencial();
        int vector[]={5,6,3,44,22,1};
        bus.MostrarArreglo(vector);
        int indice=bus.busquedaSecuencial(vector,44);
        if(indice!=-1){
            System.out.println("Elemento encontrado en el indice "+indice);
        }else{
 System.out.println("Elemento no encontrado"); 
        }
   
    
    }
}
