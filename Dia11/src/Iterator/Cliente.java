/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        ColeccionConcreta<String> coleccion = new ColeccionConcreta<>();
        coleccion.agregarElemento("Elemento 1");
        coleccion.agregarElemento("Elemento 2");
        coleccion.agregarElemento("Elemento 3");

        Iterador<String> iterador = coleccion.crearIterador();
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}
