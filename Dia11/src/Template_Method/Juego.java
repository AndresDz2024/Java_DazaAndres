/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template_Method;

/**
 *
 * @author DZ
 */
public abstract class Juego {
    public final void jugar() {
        inicializar();
        iniciarJuego();
        finalizar();
    }

    protected abstract void inicializar();

    protected abstract void iniciarJuego();

    protected abstract void finalizar();
}
