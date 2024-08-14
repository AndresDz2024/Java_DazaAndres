/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author DZ
 */
public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        System.out.print("Círculo dibujado. ");
        color.aplicarColor();
    }
}
