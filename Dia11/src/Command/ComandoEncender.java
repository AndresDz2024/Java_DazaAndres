/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author DZ
 */
public class ComandoEncender implements Comando {
    private Dispositivo dispositivo;

    public ComandoEncender(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        dispositivo.encender();
    }
}
