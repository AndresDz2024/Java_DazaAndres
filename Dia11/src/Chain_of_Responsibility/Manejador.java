/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain_of_Responsibility;

/**
 *
 * @author DZ
 */
public abstract class Manejador {
    protected Manejador siguienteManejador;

    public void setSiguiente(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract void manejarSolicitud(int nivel);
}
