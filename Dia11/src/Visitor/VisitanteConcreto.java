/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DZ
 */
public class VisitanteConcreto implements Visitante {
    @Override
    public void visitar(ElementoConcretoA elementoA) {
        System.out.println("Visitando " + elementoA.operacionA());
    }

    @Override
    public void visitar(ElementoConcretoB elementoB) {
        System.out.println("Visitando " + elementoB.operacionB());
    }
}
