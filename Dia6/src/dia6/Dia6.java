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
        PlayOffs partidoPlayOffs = new PlayOffs("Equipo C", "Equipo D", 85, 78, true, new Date(), "Final");
        Liga partidoLiga = new Liga("Equipo E", "Equipo F", 90, 88, true, new Date(), 5);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("""
                               1. Ver detalles del partido
                               2. Editar información del partido
                               3. Concluir el partido
                               4. Ver detalles del partido de playoffs
                               5. Editar información del partido de playoffs
                               6. Concluir el partido de playoffs
                               7. Ver detalles del partido de liga
                               8. Editar información del partido de liga
                               9. Concluir el partido de liga
                               0. Salir
                               """);
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline
            switch (choice) {
                case 1 -> partido.verDetalles();
                case 2 -> partido.editarInformacion();
                case 3 -> partido.concluirPartido();
                case 4 -> partidoPlayOffs.verDetalles();
                case 5 -> partidoPlayOffs.editarInformacion();
                case 6 -> partidoPlayOffs.concluirPartido();
                case 7 -> partidoLiga.verDetalles();
                case 8 -> partidoLiga.editarInformacion();
                case 9 -> partidoLiga.concluirPartido();
                case 0 -> {
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }
    }
}
