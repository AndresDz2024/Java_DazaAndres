/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template_Method;

/**
 *
 * @author DZ
 */
public class Futbol extends Juego {
    @Override
    protected void inicializar() {
        System.out.println("Iniciando partido de fútbol.");
    }

    @Override
    protected void iniciarJuego() {
        System.out.println("El partido de fútbol ha comenzado.");
    }

    @Override
    protected void finalizar() {
        System.out.println("El partido de fútbol ha terminado.");
    }
}
