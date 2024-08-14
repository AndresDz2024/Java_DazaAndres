/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DZ
 */
public class DecoradorConLeche implements Cafe {
    private Cafe cafe;

    public DecoradorConLeche(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String preparar() {
        return cafe.preparar() + " con Leche";
    }
}
