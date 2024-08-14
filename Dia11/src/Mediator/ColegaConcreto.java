/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author DZ
 */
public class ColegaConcreto extends Colega {
    private String nombre;

    public ColegaConcreto(Mediador mediador, String nombre) {
        super(mediador);
        this.nombre = nombre;
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
    
    public void enviar(String mensaje) {
        mediador.enviarMensaje(mensaje, this);
    }
}
