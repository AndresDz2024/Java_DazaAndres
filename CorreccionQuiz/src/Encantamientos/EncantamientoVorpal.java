/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author DZ
 */
public class EncantamientoVorpal implements Encantamiento {
    @Override
    public void activar() {
        System.out.println("El arma se torna roja.");
    }

    @Override
    public void aplicar() {
        System.out.println("El ataque tiene una alta posibilidad de ser crítico.");
    }

    @Override
    public void desactivar() {
        System.out.println("El color rojo desaparece.");
    }
}
