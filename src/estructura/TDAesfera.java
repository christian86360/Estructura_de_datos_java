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
public class TDAesfera {
    private double radio;
    //constructor
    public TDAesfera(double radioInicial)
    {
        if(radioInicial>0)
        {
            this.radio=radioInicial;
        }else{
            this.radio=0.0;
        }
    }
    //creamos los metodos y operaciones TDAesfera
    public double getRadio(){
       return this.radio;
    }
    
    public double getDiametro()
    {
        return (radio*2);
    }
    public double getCircuferencia()
    {
        return (Math.PI*getDiametro());
    }
    public double getArea()
    {
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen()
    {
        return (4*Math.PI*Math.pow(radio,3))/3;
    }
}
