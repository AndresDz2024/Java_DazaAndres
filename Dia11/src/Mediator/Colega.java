/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author DZ
 */
public abstract class Colega {
    protected Mediador mediador;

    public Colega(Mediador mediador) {
        this.mediador = mediador;
    }

    public abstract void recibirMensaje(String mensaje);
}
