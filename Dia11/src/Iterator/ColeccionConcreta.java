/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DZ
 */
import java.util.ArrayList;
import java.util.List;

public class ColeccionConcreta<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public Iterador<T> crearIterador() {
        return new IteradorConcreto();
    }

    private class IteradorConcreto implements Iterador<T> {
        private int indice = 0;

        @Override
        public boolean tieneSiguiente() {
            return indice < elementos.size();
        }

        @Override
        public T siguiente() {
            return elementos.get(indice++);
        }
    }
}
