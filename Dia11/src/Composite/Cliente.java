/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Cafe cafe = new DecoradorConLeche(new CafeSimple());
        System.out.println(cafe.preparar()); // "Café Simple con Leche"
    }
}
