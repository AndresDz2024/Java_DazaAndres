/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template_Method;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Juego futbol = new Futbol();
        futbol.jugar();

        Juego tenis = new Tenis();
        tenis.jugar();
    }
}
