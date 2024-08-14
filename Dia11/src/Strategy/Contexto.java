/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author DZ
 */
public class Contexto {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int ejecutarEstrategia(int a, int b) {
        return estrategia.ejecutar(a, b);
    }
}
