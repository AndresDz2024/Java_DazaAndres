/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Expresion isJava = new ExpresionTerminal("Java");
        Expresion isPython = new ExpresionTerminal("Python");

        Expresion isJavaOrPython = new ExpresionOR(isJava, isPython);

        System.out.println("¿El contexto contiene 'Java'? " + isJavaOrPython.interpretar("Java"));
        System.out.println("¿El contexto contiene 'Python'? " + isJavaOrPython.interpretar("Python"));
        System.out.println("¿El contexto contiene 'C++'? " + isJavaOrPython.interpretar("C++"));
    }
}
