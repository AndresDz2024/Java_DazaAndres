/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6;

/**
 *
 * @author DZ
 */

import java.util.Date;

public class Liga extends Partido {
    private int jornada;

    public Liga(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitante, boolean estado, Date fechaPartido, int jornada) {
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, estado, fechaPartido);
        this.jornada = jornada;
    }

    public int obtenerJornada() {
        return jornada;
    }

    public void establecerJornada(int jornada) {
        this.jornada = jornada;
    }

    public void partidoInfo() {
        System.out.println("Información del partido de Liga");
        System.out.println("Fecha del partido: " + obtenerFechaPartido());
        if (obtenerEstado()) {
            System.out.println("El partido se encuentra en juego");
        } else {
            System.out.println("El partido ya ha finalizado");
        }
        System.out.println("Equipo Local: " + obtenerEquipoLocal());
        System.out.println("Equipo Visitante: " + obtenerEquipoVisitante());
        System.out.println("Cestas del equipo Local: " + obtenerCestasLocal());
        System.out.println("Cestas del equipo Visitante: " + obtenerCestasVisitante());
        System.out.println("Jornada de la liga: " + jornada);
    }

    @Override
    public void verDetalles() {
        System.out.println("Partido de Liga");
        System.out.println("¿Qué tipo de información quiere visualizar?");
        System.out.println("1. Información general del partido");
        System.out.println("2. Marcador actual del partido");
        System.out.println("3. Resultados del partido");
        System.out.println("4. Equipo Ganador");
        System.out.println("5. Salir");

        int option = sc.nextInt();
        sc.nextLine(); // consume the newline
        switch (option) {
            case 1 -> partidoInfo();
            case 2 -> mostrarMarcador();
            case 3 -> mostrarResultados();
            case 4 -> mostrarGanador();
            case 5 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida");
        }
    }

    @Override
    public void editarInformacion() {
        System.out.println("Modificar Información del Partido");
        System.out.println("¿Qué tipo de información quiere modificar?");
        System.out.println("""
                           1. Equipo Local
                           2. Equipo Visitante
                           3. Cestas del Equipo Local
                           4. Cestas del Equipo Visitante
                           5. Fecha del partido
                           6. Jornada de Liga
                           7. Salir
                           """);

        int option = sc.nextInt();
        sc.nextLine(); // consume the newline
        switch (option) {
            case 1 -> {
                System.out.println("Ingrese el nuevo equipo local");
                String rta = sc.nextLine();
                establecerEquipoLocal(rta);
                System.out.println("Se ingresó el nuevo equipo local exitosamente");
            }
            case 2 -> {
                System.out.println("Ingrese el nuevo equipo visitante");
                String rta2 = sc.nextLine();
                establecerEquipoVisitante(rta2);
                System.out.println("Se ingresó el nuevo equipo visitante exitosamente");
            }
            case 3 -> {
                System.out.println("Ingrese el número de cestas del equipo local");
                int rta3 = sc.nextInt();
                establecerCestasLocal(rta3);
                System.out.println("Se ingresó el número de cestas del equipo local exitosamente");
            }
            case 4 -> {
                System.out.println("Ingrese el número de cestas del equipo visitante");
                int rta4 = sc.nextInt();
                establecerCestasVisitante(rta4);
                System.out.println("Se ingresó el número de cestas del equipo visitante exitosamente");
            }
            case 5 -> {
                System.out.println("Ingrese la nueva fecha del partido (YYYY-MM-DD)");
                String rta5 = sc.nextLine();
                establecerFechaPartido(rta5);
                System.out.println("Se ingresó la nueva fecha del partido exitosamente");
            }
            case 6 -> {
                System.out.println("Ingrese la jornada del partido de liga");
                int rta6 = sc.nextInt();
                establecerJornada(rta6);
                System.out.println("Se ingresó la nueva jornada del partido exitosamente");
            }
            case 7 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida");
        }
    }
}
