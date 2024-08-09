/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;  
/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.obtenerInstancia();
        singleton.mostrarMensaje();
    }
}
