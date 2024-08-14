/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author DZ
 */
public class EstrategiaResta implements Estrategia {
    @Override
    public int ejecutar(int a, int b) {
        return a - b;
    }
}
