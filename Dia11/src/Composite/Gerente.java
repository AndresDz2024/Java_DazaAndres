/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DZ
 */
import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empleado {
    private String nombre;
    private String id;
    private List<Empleado> subordinados = new ArrayList<>();

    public Gerente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void agregarSubordinado(Empleado emp) {
        subordinados.add(emp);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente [Nombre: " + nombre + ", ID: " + id + "]");
        for (Empleado emp : subordinados) {
            emp.mostrarDetalles();
        }
    }
}
