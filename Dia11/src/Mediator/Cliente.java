/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        MediadorConcreto mediador = new MediadorConcreto();

        ColegaConcreto colega1 = new ColegaConcreto(mediador, "Colega 1");
        ColegaConcreto colega2 = new ColegaConcreto(mediador, "Colega 2");
        ColegaConcreto colega3 = new ColegaConcreto(mediador, "Colega 3");

        mediador.agregarColega(colega1);
        mediador.agregarColega(colega2);
        mediador.agregarColega(colega3);

        colega1.enviar("Hola a todos!");
        colega2.enviar("Hola!");
    }
}
