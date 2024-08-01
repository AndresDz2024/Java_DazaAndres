/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6;

/**
 *
 * @author DZ
 */

import java.util.Date;
import java.util.Scanner;

public class Dia6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestión de partidos de baloncesto.");

        Partido partido = new Partido("Equipo A", "Equipo B", 80, 75, false, new Date());

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("""
                               1. Ver detalles del partido
                               2. Editar información del partido
                               3. Concluir el partido
                               4. Salir
                               """);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> partido.verDetalles();
                case 2 -> partido.editarInformacion();
                case 3 -> partido.concluirPartido();
                case 4 -> {
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }
    }
}
