/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author ARGOM
 */
public class Desarrollador implements Trabajable, Comestible {
    @Override
    public void trabajar() {
        System.out.println("Desarrollando software...");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo almuerzo...");
    }
}
