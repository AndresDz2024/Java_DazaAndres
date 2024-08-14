/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DZ
 */
public class Empresa {
    public static void main(String[] args) {
        Empleado dev1 = new Desarrollador("Alice", "001");
        Empleado dev2 = new Desarrollador("Bob", "002");

        Gerente gerente = new Gerente("Charlie", "003");
        gerente.agregarSubordinado(dev1);
        gerente.agregarSubordinado(dev2);

        gerente.mostrarDetalles(); 
    }
}
