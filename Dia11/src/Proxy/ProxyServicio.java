/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author DZ
 */
public class ProxyServicio implements InterfazServicio {
    private ServicioReal servicioReal;

    @Override
    public void operacion() {
        if (servicioReal == null) {
            servicioReal = new ServicioReal();
        }
        System.out.println("Operación a través del proxy.");
        servicioReal.operacion();
    }
}
