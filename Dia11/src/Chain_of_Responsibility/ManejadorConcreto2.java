/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain_of_Responsibility;

/**
 *
 * @author DZ
 */
public class ManejadorConcreto2 extends Manejador {
    @Override
    public void manejarSolicitud(int nivel) {
        if (nivel == 2) {
            System.out.println("Manejador 2 procesó la solicitud.");
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarSolicitud(nivel);
        }
    }
}
