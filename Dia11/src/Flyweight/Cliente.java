/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        FabricaDeTiposDeCaracteres fabrica = new FabricaDeTiposDeCaracteres();

        TipoDeCaracter a = fabrica.obtenerTipoDeCaracter('a');
        TipoDeCaracter b = fabrica.obtenerTipoDeCaracter('b');
        TipoDeCaracter a2 = fabrica.obtenerTipoDeCaracter('a');

        a.mostrar(12, "Rojo");
        b.mostrar(14, "Azul");
        a2.mostrar(18, "Verde");
    }
}
