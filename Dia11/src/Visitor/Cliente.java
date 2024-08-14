/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Elemento[] elementos = {new ElementoConcretoA(), new ElementoConcretoB()};
        Visitante visitante = new VisitanteConcreto();

        for (Elemento elemento : elementos) {
            elemento.aceptar(visitante);
        }
    }
}
