/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author DZ
 */
public class Juego {
    public static void main(String[] args) {
        Arma espadaConFuego = new Espada(new EncantamientoFuego());
        Arma martilloVorpal = new Martillo(new EncantamientoVorpal());

        espadaConFuego.blandir();
        espadaConFuego.atacar();
        espadaConFuego.soltar();

        martilloVorpal.blandir();
        martilloVorpal.atacar();
        martilloVorpal.soltar();
    }
}
