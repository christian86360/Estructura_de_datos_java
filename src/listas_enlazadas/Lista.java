package listas_enlazadas;

/**
 *
 * @author CHRISHATAKE
 */
public class Lista {

    protected Nodo inicio, fin;//punteros para saber donde esta el inicio y el fin
    //inicializamos los punteros

    public Lista() {
        inicio = null;
        fin = null;
    }
//metodo para saber si la lista esta vacia

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento) {
        //creando al Nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }

    }

    //metodo para insertar al inal de la lista
    public void agregarAlFinal(int elemento) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);

        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    //metodo para mostrar los datos
    public void mostrarLista() {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]" + "--->");
            recorrer = recorrer.siguiente;
        }
    }

    //metodo para eleiminar un nodo del inicio
    public int borrarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;

        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }
//metodo para eliminar unNodo del final

    public int borrarDelFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    //Metodo para eliminar un Nodo en especifico
    public void eliminarNodo(int elemento) {
        if (!estaVacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
            } else if (elemento == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }
    //Metodo para buscar un element
    public boolean estaEnlaLista(int elemento){
        Nodo temporal=inicio;
        while(temporal!=null && temporal.dato!=elemento){
            temporal=temporal.siguiente;
        }
        return temporal!=null;
    }
}
