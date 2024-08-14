/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

/**
 *
 * @author DZ
 */
import java.util.HashMap;
import java.util.Map;

public class FabricaDeTiposDeCaracteres {
    private Map<Character, TipoDeCaracter> cache = new HashMap<>();

    public TipoDeCaracter obtenerTipoDeCaracter(char simbolo) {
        TipoDeCaracter tipo = cache.get(simbolo);
        if (tipo == null) {
            tipo = new TipoDeCaracter(simbolo);
            cache.put(simbolo, tipo);
        }
        return tipo;
    }
}
