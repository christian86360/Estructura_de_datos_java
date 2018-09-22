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
public class RecursividadFibonacci {
    //crando el metodo recursivo para la sucesion bibonaci

    public int fibonacciRdecursivo(int n) {
        if (n == 1 || n == 2) {
            //caso base respuesta explicita
            return 1;
        } else {
            //Dominio (problema - 1)
            return fibonacciRdecursivo(n - 1) + fibonacciRdecursivo(n - 2);

        }
        //Creando metodo con ciclo para la sucesion fibonacci

    }

    public int fibonacciCiclo(int n) {
        int fibo = 0, primero = 1, segundo = 0;
        while (n > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        //
        return fibo;
    }

    public static void main(String[] args) {

        RecursividadFibonacci f = new RecursividadFibonacci();
        System.out.println("la Sucesion Fibonacci: " + f.fibonacciRdecursivo(12));
        System.out.println("Mediante siclo es: " + f.fibonacciCiclo(4));
    }

}
