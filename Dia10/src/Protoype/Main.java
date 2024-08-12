 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Protoype;

/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        System.out.println(coche1);

        Coche coche2 = coche1.clonar();
        System.out.println(coche2);
    }
}
