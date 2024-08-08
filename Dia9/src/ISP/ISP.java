/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ISP;

/**
 *
 * @author ARGOM
 */
public class ISP {

    public static void main(String[] args) {
        Trabajable desarrollador = new Desarrollador();
        Trabajable robot = new Robot();
        Comestible desarrolladorComestible = (Comestible) desarrollador;

        desarrollador.trabajar();
        robot.trabajar();
        desarrolladorComestible.comer();
    }
}
