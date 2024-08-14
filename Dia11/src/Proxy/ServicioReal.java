/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author DZ
 */
public class ServicioReal implements InterfazServicio {
    @Override
    public void operacion() {
        System.out.println("Operación realizada por el servicio real.");
    }
}
