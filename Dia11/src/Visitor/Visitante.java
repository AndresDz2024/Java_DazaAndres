/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor;

/**
 *
 * @author DZ
 */
public interface Visitante {
    void visitar(ElementoConcretoA elementoA);
    void visitar(ElementoConcretoB elementoB);
}
