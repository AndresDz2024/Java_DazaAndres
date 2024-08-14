/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Originador originador = new Originador();
        Caretaker caretaker = new Caretaker();

        originador.setEstado("Estado 1");
        caretaker.agregarMemento(originador.guardarEstado());

        originador.setEstado("Estado 2");
        caretaker.agregarMemento(originador.guardarEstado());

        originador.setEstado("Estado 3");
        originador.restaurarEstado(caretaker.obtenerMemento(1)); // Estado 2
    }
}
