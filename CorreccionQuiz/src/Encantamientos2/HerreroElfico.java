/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos2;

/**
 *
 * @author DZ
 */
public class HerreroElfico implements Herrero {
    @Override
    public Arma forjarArma(String tipoArma) {
        if ("Espada".equalsIgnoreCase(tipoArma)) {
            return new Espada();
        } else if ("Martillo".equalsIgnoreCase(tipoArma)) {
            return new Martillo();
        }
        throw new IllegalArgumentException("Tipo de arma desconocido: " + tipoArma);
    }
}
