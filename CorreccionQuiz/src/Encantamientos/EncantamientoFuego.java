/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author DZ
 */
public class EncantamientoFuego implements Encantamiento {
    @Override
    public void activar() {
        System.out.println("El arma brilla con un aura de fuego.");
    }

    @Override
    public void aplicar() {
        System.out.println("El ataque añade daño de fuego.");
    }

    @Override
    public void desactivar() {
        System.out.println("El aura de fuego se desvanece.");
    }
}
