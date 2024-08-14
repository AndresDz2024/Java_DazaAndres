/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author DZ
 */
public class EstadoEncendido implements Estado {
    @Override
    public void hacerAccion() {
        System.out.println("El dispositivo está encendido.");
    }
}
