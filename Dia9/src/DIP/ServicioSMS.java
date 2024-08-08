/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author ARGOM
 */
public class ServicioSMS implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje, String receptor) {
        System.out.println("Enviando SMS a " + receptor + " con el mensaje: " + mensaje);
    }
}
