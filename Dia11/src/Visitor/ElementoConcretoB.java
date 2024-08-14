/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DZ
 */
public class ElementoConcretoB extends Elemento {
    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String operacionB() {
        return "Operación B realizada.";
    }
}
