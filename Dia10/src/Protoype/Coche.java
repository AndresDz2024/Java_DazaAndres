/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Protoype;

/**
 *
 * @author DZ
 */
class Coche implements Clonable {
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public Coche clonar() {
        return new Coche(marca, modelo);
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo;
    }
}
