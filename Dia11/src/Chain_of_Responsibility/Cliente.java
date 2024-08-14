/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain_of_Responsibility;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Manejador manejador1 = new ManejadorConcreto1();
        Manejador manejador2 = new ManejadorConcreto2();

        manejador1.setSiguiente(manejador2);

        manejador1.manejarSolicitud(1); // Manejador 1 procesó la solicitud.
        manejador1.manejarSolicitud(2); // Manejador 2 procesó la solicitud.
    }
}
