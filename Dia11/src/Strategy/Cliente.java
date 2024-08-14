/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        contexto.setEstrategia(new EstrategiaSuma());
        System.out.println("Suma: " + contexto.ejecutarEstrategia(5, 3));

        contexto.setEstrategia(new EstrategiaResta());
        System.out.println("Resta: " + contexto.ejecutarEstrategia(5, 3));
    }
}
