/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_recursivos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHRISHATAKE
 */
public class MetodosRecursivos {
    
    public static void main(String[] args)
    {
        MetodosRecursivos objEsc=new MetodosRecursivos();
        objEsc.bajarEscalera(20);
        
    }
    //creando un metodo para vajar una escalera de manera 
    //recursiva
    public void bajarEscalera(int escalones){
        
        
        if(escalones==0){
            //caso base , respuesta explicita
            System.out.println("Has terminado de bajar la escalera");
        }else{
            try {
                //Dominio, la divicion del problema original (problema-1)
              //para dar pausa ala ejecucion del programa
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MetodosRecursivos.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            System.out.println("Bajando escalon "+escalones);
         //haciendo uso de la recursividad
            bajarEscalera(escalones - 1);
        }
        
        
    }
    
}
