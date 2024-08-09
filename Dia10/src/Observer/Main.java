/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer;

/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Observador observador1 = new ObservadorConcreto("Observador 1");
        Observador observador2 = new ObservadorConcreto("Observador 2");

        sujeto.agregarObservador(observador1);
        sujeto.agregarObservador(observador2);

        sujeto.setMensaje("¡Nueva actualización!");
    }
}
