/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DZ
 */
public class Desarrollador implements Empleado {
    private String nombre;
    private String id;

    public Desarrollador(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Desarrollador [Nombre: " + nombre + ", ID: " + id + "]");
    }
}
