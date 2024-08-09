/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DZ
 */
class DecoradorConAzucar implements Cafe {
    private Cafe cafe;

    public DecoradorConAzucar(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getDescripcion() {
        return cafe.getDescripcion() + ", Azúcar";
    }

    public double costo() {
        return cafe.costo() + 0.2;
    }
}
