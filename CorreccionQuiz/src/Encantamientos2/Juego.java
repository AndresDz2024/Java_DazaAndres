/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encantamientos2;

/**
 *
 * @author DZ
 */
public class Juego {
    public static void main(String[] args) {
        Herrero herreroElfico = new HerreroElfico();
        Armeria armeriaElfica = new Armeria(herreroElfico);
        Arma espadaElfica = armeriaElfica.crearArma("Espada");
        System.out.println("Creada: " + espadaElfica.getNombre() + " por un herrero élfico.");

        Herrero herreroEnano = new HerreroEnano();
        Armeria armeriaEnana = new Armeria(herreroEnano);
        Arma martilloEnano = armeriaEnana.crearArma("Martillo");
        System.out.println("Creado: " + martilloEnano.getNombre() + " por un herrero enano.");
    }
}
