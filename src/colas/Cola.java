
package colas;

/**
 *
 * @author CHRISHATAKE
 */
public class Cola {
    NodoCola inicio,fin;
    int tamano;
    public Cola(){
        inicio=fin=null;
        tamano=0;
    }
    //metodo para ver si esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    public void insertar(int ele ){
        NodoCola nuevo=new NodoCola(ele);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamano++;
    }
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamano--;
        return aux;
    }
    public int inicioCola(){
        return inicio.dato;
    }
    public int tamanoCola(){
        return tamano;
    }
    
}
