/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DZ
 */
public class ExpresionTerminal implements Expresion {
    private String dato;

    public ExpresionTerminal(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean interpretar(String contexto) {
        return contexto.contains(dato);
    }
}
