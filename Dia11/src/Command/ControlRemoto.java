/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author DZ
 */
public class ControlRemoto {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void presionarBoton() {
        comando.ejecutar();
    }
}
