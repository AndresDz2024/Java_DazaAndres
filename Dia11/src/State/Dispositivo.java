/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author DZ
 */
public class Dispositivo {
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void presionarBoton() {
        estado.hacerAccion();
    }
}
