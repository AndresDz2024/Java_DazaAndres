/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DZ
 */
class CafeSimple implements Cafe {
    public String getDescripcion() {
        return "Café Simple";
    }

    public double costo() {
        return 2.0;
    }
}
