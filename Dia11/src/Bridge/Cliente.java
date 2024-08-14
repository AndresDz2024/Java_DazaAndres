/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Forma circuloRojo = new Circulo(new ColorRojo());
        circuloRojo.dibujar(); // "Círculo dibujado. Color rojo aplicado."
        
        Forma circuloAzul = new Circulo(new ColorAzul());
        circuloAzul.dibujar(); // "Círculo dibujado. Color azul aplicado."
    }
}
