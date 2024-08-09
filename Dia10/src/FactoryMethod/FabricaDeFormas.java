/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author DZ
 */
class FabricaDeFormas {
    public Forma obtenerForma(String tipoDeForma) {
        if (tipoDeForma == null) {
            return null;
        }
        if (tipoDeForma.equalsIgnoreCase("CIRCULO")) {
            return new Circulo();
        } else if (tipoDeForma.equalsIgnoreCase("CUADRADO")) {
            return new Cuadrado();
        }
        return null;
    }
}
