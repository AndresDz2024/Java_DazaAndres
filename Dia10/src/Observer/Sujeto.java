/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DZ
 */
class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String mensaje;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificarObservadores();
    }
}
