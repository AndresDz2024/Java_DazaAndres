/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

/**
 *
 * @author DZ
 */
public class TipoDeCaracter {
    private char simbolo;

    public TipoDeCaracter(char simbolo) {
        this.simbolo = simbolo;
    }

    public void mostrar(int tamaño, String color) {
        System.out.println("Caracter: " + simbolo + ", Tamaño: " + tamaño + ", Color: " + color);
    }
}
