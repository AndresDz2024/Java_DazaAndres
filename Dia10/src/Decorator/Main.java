/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator;

/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimple();
        System.out.println(cafe.getDescripcion() + " $" + cafe.costo());

        cafe = new DecoradorConLeche(cafe);
        System.out.println(cafe.getDescripcion() + " $" + cafe.costo());

        cafe = new DecoradorConAzucar(cafe);
        System.out.println(cafe.getDescripcion() + " $" + cafe.costo());
    }
}
