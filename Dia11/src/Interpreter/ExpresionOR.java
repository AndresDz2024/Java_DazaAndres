/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DZ
 */
public class ExpresionOR implements Expresion {
    private Expresion expresion1;
    private Expresion expresion2;

    public ExpresionOR(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpretar(String contexto) {
        return expresion1.interpretar(contexto) || expresion2.interpretar(contexto);
    }
}
