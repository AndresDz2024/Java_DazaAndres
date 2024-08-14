/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();

        Estado encendido = new EstadoEncendido();
        Estado apagado = new EstadoApagado();

        dispositivo.setEstado(encendido);
        dispositivo.presionarBoton();

        dispositivo.setEstado(apagado);
        dispositivo.presionarBoton();
    }
}
