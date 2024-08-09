/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        FabricaDeFormas fabrica = new FabricaDeFormas();

        Forma forma1 = fabrica.obtenerForma("CIRCULO");
        forma1.dibujar();

        Forma forma2 = fabrica.obtenerForma("CUADRADO");
        forma2.dibujar();
    }
}
