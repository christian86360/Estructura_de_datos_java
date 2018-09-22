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
public class Torres_de_Hanoi_mediante_Recursividad {
    //creando el metodo recursivo para solucionar las torres de hanoi

    public void torresHanoi(int discos, int torre1, int torre2, int torre3) {
        //caso base
        if (discos == 1) {
            System.out.println("Mover disco de Torre " + torre1 + " a torre " + torre3);
        } else {
            //dominio
            torresHanoi(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a torre " + torre3);
            torresHanoi(discos - 1, torre2, torre1, torre3);
        }

    }

    public static void main(String[] args) {
        {
            Torres_de_Hanoi_mediante_Recursividad t = new Torres_de_Hanoi_mediante_Recursividad();

            t.torresHanoi(4, 1, 2, 3);
            System.out.println("Juego completado");
        }

    }

}
