/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DIP;

/**
 *
 * @author ARGOM
 */
public class DIP {

        public static void main(String[] args) {
        ServicioMensaje servicioCorreo = new ServicioCorreo();
        ServicioMensaje servicioSMS = new ServicioSMS();

        Notificador notificadorCorreo = new Notificador(servicioCorreo);
        Notificador notificadorSMS = new Notificador(servicioSMS);

        notificadorCorreo.notificar("Hola por Correo!", "alice@example.com");
        notificadorSMS.notificar("Hola por SMS!", "123-456-7890");
    }
}
