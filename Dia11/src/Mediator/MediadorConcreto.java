/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author DZ
 */
import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador {
    private List<Colega> colegas;

    public MediadorConcreto() {
        colegas = new ArrayList<>();
    }

    public void agregarColega(Colega colega) {
        colegas.add(colega);
    }

    @Override
    public void enviarMensaje(String mensaje, Colega remitente) {
        for (Colega colega : colegas) {
            if (colega != remitente) {
                colega.recibirMensaje(mensaje);
            }
        }
    }
}
