/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author DZ
 */
class Director {
    private ConstructorDeCasa constructor;

    public void setConstructor(ConstructorDeCasa constructor) {
        this.constructor = constructor;
    }

    public Casa construirCasa() {
        constructor.crearNuevaCasa();
        constructor.construirParedes();
        constructor.construirTecho();
        constructor.construirPiscina();
        return constructor.obtenerCasa();
    }
}
