/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();
        Comando encender = new ComandoEncender(dispositivo);

        ControlRemoto control = new ControlRemoto();
        control.setComando(encender);
        control.presionarBoton(); 
    }
}
