/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

/**
 *
 * @author DZ
 */
public class Originador {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado actual: " + estado);
    }

    public Memento guardarEstado() {
        return new Memento(estado);
    }

    public void restaurarEstado(Memento memento) {
        this.estado = memento.getEstado();
        System.out.println("Estado restaurado: " + estado);
    }
}
