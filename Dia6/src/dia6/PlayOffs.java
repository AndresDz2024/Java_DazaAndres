/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6;

import java.util.Date;

/**
 *
 * @author DZ
 */
public class PlayOffs extends Partido {
    private String ronda;

    public PlayOffs(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitante, boolean estado, Date fechaPartido, String ronda) {
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, estado, fechaPartido);
        this.ronda = ronda;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    public void partidoInfo() {
        System.out.println("Información del partido de PlayOffs");
        System.out.println("Fecha del partido: " + obtenerFechaPartido());
        if (obtenerEstado()) {
            System.out.println("El partido se encuentra en juego");
        } else {
            System.out.println("El partido no se encuentra en juego");
        }
        System.out.println("Equipo local: " + obtenerEquipoLocal());
        System.out.println("Equipo visitante: " + obtenerEquipoVisitante());
        System.out.println("Cestas de equipo local: " + obtenerCestasLocal());
        System.out.println("Cestas de equipo visitante: " + obtenerCestasVisitante());
        System.out.println("Ronda del partido: " + ronda);
    }

    @Override
    public void verDetalles() {
        System.out.println("Partido de PlayOffs");
        System.out.println("¿Qué tipo de información quiere visualizar?");
        System.out.println("1. Información general del partido");
        System.out.println("2. Marcador actual del partido");
        System.out.println("3. Resultado del partido");
        System.out.println("4. Equipo ganador");
        System.out.println("5. Salir");

        int option = sc.nextInt();
        sc.nextLine(); // consume the newline
        switch (option) {
            case 1 -> partidoInfo();
            case 2 -> mostrarMarcador();
            case 3 -> mostrarResultados();
            case 4 -> mostrarGanador();
            case 5 -> System.out.println("Saliendo....");
            default -> System.out.println("Opción incorrecta");
        }
    }

    @Override
    public void editarInformacion() {
        System.out.println("Modificar información del partido");
        System.out.println("¿Qué tipo de información quiere modificar?");
        System.out.println("""
                           1. Equipo Local
                           2. Equipo Visitante
                           3. Cestas del equipo local
                           4. Cestas del equipo visitante
                           5. Fecha del partido
                           6. Ronda del partido
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
                System.out.println("Ingrese la nueva ronda del partido (Octavos, Cuartos, Final)");
                String rta6 = sc.nextLine();
                if ("Octavos".equals(rta6) || "Cuartos".equals(rta6) || "Final".equals(rta6)) {
                    setRonda(rta6);
                    System.out.println("Se ingresó la nueva ronda: " + getRonda());
                } else {
                    System.out.println("No existe la ronda ingresada " + rta6);
                }
            }
            case 7 -> System.out.println("Saliendo....");
            default -> System.out.println("Opción inválida");
        }
    }
}
