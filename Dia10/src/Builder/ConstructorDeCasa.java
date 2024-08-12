/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author DZ
 */
abstract class ConstructorDeCasa {
    protected Casa casa;

    public void crearNuevaCasa() {
        casa = new Casa();
    }

    public Casa obtenerCasa() {
        return casa;
    }

    public abstract void construirParedes();
    public abstract void construirTecho();
    public abstract void construirPiscina();
}
