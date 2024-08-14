/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos2;

/**
 *
 * @author DZ
 */
public class Armeria {
    private Herrero herrero;

    public Armeria(Herrero herrero) {
        this.herrero = herrero;
    }

    public Arma crearArma(String tipoArma) {
        return herrero.forjarArma(tipoArma);
    }
}
