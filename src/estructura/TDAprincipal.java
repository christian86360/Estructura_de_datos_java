/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author CHRISHATAKE
 */
public class TDAprincipal {
    
    public static void main(String[] args)
    {
        TDAesfera esfera=new TDAesfera(3);
        System.out.println("Radio "+esfera.getRadio());
        System.out.println("diametro "+esfera.getDiametro());
        System.out.println("Circuferencia "+esfera.getCircuferencia());
        System.out.println("Area "+esfera.getArea());
        System.out.println("Bolumen "+esfera.getVolumen());
    }
    
}
