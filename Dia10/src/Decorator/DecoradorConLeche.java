/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DZ
 */
class DecoradorConLeche implements Cafe {
    private Cafe cafe;

    public DecoradorConLeche(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }

    public double costo() {
        return cafe.costo() + 0.5;
    }
}
