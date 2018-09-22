/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_recursivos;

/**
 *
 * @author CHRISHATAKE
 */
public class Recursivida2 {
    
    public static void main(String[] arg) {
        
        Recursivida2 r = new Recursivida2();
        System.out.println("el factorial es: " + r.factorialRecursivo(5));
        System.out.println("El factor es: " + r.factorialCiclo(5));
    }

    //creando el metodo factorial de manera recursiva
    public int factorialRecursivo(int n) {
        if (n < 0) {
            return 0;
        } else //caso base
         if (n == 0) {
                return 1;
                
            } else {
                //Dominio
                return n * factorialRecursivo(n - 1);
                
            }
        
    }

    //creando metodo factorial mediante ciclo
    public int factorialCiclo(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;
            
        }
    }
    
}
