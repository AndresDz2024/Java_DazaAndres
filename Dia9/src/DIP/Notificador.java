/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author ARGOM
 */
public class Notificador {
    private ServicioMensaje servicioMensaje;

    public Notificador(ServicioMensaje servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }

    public void notificar(String mensaje, String receptor) {
        servicioMensaje.enviarMensaje(mensaje, receptor);
    }
}
