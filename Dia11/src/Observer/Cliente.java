/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Observador obs1 = new ObservadorConcreto("Observador 1");
        Observador obs2 = new ObservadorConcreto("Observador 2");

        sujeto.agregarObservador(obs1);
        sujeto.agregarObservador(obs2);

        sujeto.cambiarEstado("Nuevo Estado");
    }
}
