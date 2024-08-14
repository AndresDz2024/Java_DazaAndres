/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        InterfazServicio servicio = new ProxyServicio();
        servicio.operacion(); 
    }
}
