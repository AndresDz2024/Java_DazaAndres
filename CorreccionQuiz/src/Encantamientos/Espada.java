/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author DZ
 */
public class Espada implements Arma {
    private Encantamiento encantamiento;

    public Espada(Encantamiento encantamiento) {
        this.encantamiento = encantamiento;
    }

    @Override
    public void blandir() {
        encantamiento.activar();
    }

    @Override
    public void atacar() {
        encantamiento.aplicar();
    }

    @Override
    public void soltar() {
        encantamiento.desactivar();
    }
}
