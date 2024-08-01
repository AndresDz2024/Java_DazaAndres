/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6;

/**
 *
 * @author DZ
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Partido {
    Scanner sc = new Scanner(System.in);
        
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int cestasLocal;
    protected int cestasVisitante;
    protected boolean estado;
    protected Date fechaPartido;
    
    public Partido(){
    }
    public Partido(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,boolean estado,Date fechaPartido){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitante = cestasVisitante;
        this.estado = estado;
        this.fechaPartido = fechaPartido;
    }
    public Partido(String equipoLocal,String equipoVisitante,int cestasLocal,int cestasVisitante,String estado,String fechaPartido){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitante = cestasVisitante;
        this.estado = "activo".equalsIgnoreCase(estado);
        this.fechaPartido = parsearFecha(fechaPartido);
    }

    private Date parsearFecha(String fechaPartido) {
        DateFormat[] dateFormats = {
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy-MM-dd")
        };
        for (DateFormat df : dateFormats) {
            try {
                return df.parse(fechaPartido);
            } catch (ParseException e) {
                // Continue trying next format
            }
        }
        Logger.getLogger(Partido.class.getName()).log(Level.SEVERE, "Formato de fecha no válido", fechaPartido);
        return null;
    }
    
    public String obtenerEquipoLocal(){
        return equipoLocal;
    }
    public void establecerEquipoLocal(String equipoLocal){
        this.equipoLocal = equipoLocal;
    }
    
    public String obtenerEquipoVisitante(){
        return equipoVisitante;
    }
    public void establecerEquipoVisitante(String equipoVisitante){
        this.equipoVisitante = equipoVisitante;
    }
    
    public int obtenerCestasLocal(){
        return cestasLocal;
    }
    public void establecerCestasLocal(int cestasLocal){
        this.cestasLocal = cestasLocal;
    }
    
    public int obtenerCestasVisitante(){
        return cestasVisitante;
    }
    public void establecerCestasVisitante(int cestasVisitante){
        this.cestasVisitante = cestasVisitante;
    }
    
    public boolean obtenerEstado(){
        return estado;
    }
    public void establecerEstado(boolean estado){
        this.estado = estado;
    }
    public void establecerEstado(String estado){
        this.estado = "activo".equalsIgnoreCase(estado);
    }
    
    public Date obtenerFechaPartido(){
        return fechaPartido;
    }
    public void establecerFechaPartido(Date fechaPartido){
        this.fechaPartido = fechaPartido;
    }
    public void establecerFechaPartido(String fechaPartido){
        this.fechaPartido = parsearFecha(fechaPartido);
    }
    
    public void mostrarGanador(){
        System.out.println(" Ganador del partido ");
        if(estado){
            System.out.println("No disponible, el juego aún está en curso.");
        } else {
            if(cestasLocal > cestasVisitante){
                System.out.println("El equipo local, " + equipoLocal + ", ha ganado!");
            } else {
                System.out.println("El equipo visitante, " + equipoVisitante + ", ha ganado!");
            }
        }
    }
    
    public void mostrarResultados(){
        System.out.println( "Resultados del juego ");
        if(estado){
            System.out.println("No disponible, el juego aún está en curso.");
        } else {
            System.out.println("Equipo local: " + equipoLocal + "   Puntos: " + cestasLocal +
               "\nEquipo visitante: " + equipoVisitante + "   Puntos: " + cestasVisitante);
        }
    }
    
    public void mostrarMarcador(){
        System.out.println("Marcador del partido");
        System.out.println("Equipo local: " + equipoLocal + "   Puntos: " + cestasLocal +
               "\nEquipo visitante: " + equipoVisitante + "   Puntos: " + cestasVisitante);
    }
    
    public void mostrarInformacion(){
        System.out.println("Información del juego");
        System.out.println("Fecha del juego: " + fechaPartido);
        if (estado){
            System.out.println("El partido está activo.");
        } else {
            System.out.println("El partido no está activo.");
        }
        System.out.println("\nEnfrentamiento entre:");
        System.out.println("Equipo local: " + equipoLocal);
        System.out.println("      Puntos: " + cestasLocal);
        System.out.println("\nEquipo visitante: " + equipoVisitante);
        System.out.println("      Puntos: " + cestasVisitante);
    }
    
    public void verDetalles(){
        System.out.println("Detalles del partido");
        System.out.println("¿Qué tipo de información desea ver?");
        System.out.println("""
                           1. Información general del juego
                           2. Marcador actual del juego
                           3. Resultados del juego
                           4. Equipo ganador
                           5. Volver""");
        int choice = sc.nextInt();
        sc.nextLine(); 
        switch(choice){
            case 1 -> mostrarInformacion();
            case 2 -> mostrarMarcador();
            case 3 -> mostrarResultados();
            case 4 -> mostrarGanador();
            default -> System.out.println("\nRegresando...\n");
        }
    }
    
    public void editarInformacion(){
        System.out.println("Editar información del partido" );
        System.out.println("¿Qué información desea modificar?");
        System.out.println("""
                           1. Equipo local
                           2. Equipo visitante
                           3. Puntos del equipo local
                           4. Puntos del equipo visitante
                           5. Fecha del juego
                           6. Volver""");
        int choice = sc.nextInt();
        sc.nextLine(); // consume the newline
        switch(choice){
            case 1 -> {
                System.out.println("Ingrese el nuevo equipo local, actualmente es: " + obtenerEquipoLocal());
                String input = sc.nextLine();
                establecerEquipoLocal(input);
                System.out.println("Nuevo equipo local registrado: " + obtenerEquipoLocal());
            }
            case 2 -> {
                System.out.println("Ingrese el nuevo equipo visitante, actualmente es: " + obtenerEquipoVisitante());
                String input = sc.nextLine();
                establecerEquipoVisitante(input);
                System.out.println("Nuevo equipo visitante registrado: " + obtenerEquipoVisitante());
            }
            case 3 -> {
                System.out.println("Ingrese el número de puntos del equipo local, actualmente son: " + obtenerCestasLocal());
                int input = sc.nextInt();
                establecerCestasLocal(input);
                System.out.println("Nuevos puntos del equipo local registrados: " + obtenerCestasLocal());
            }
            case 4 -> {
                System.out.println("Ingrese el número de puntos del equipo visitante, actualmente son: " + obtenerCestasVisitante());
                int input = sc.nextInt();
                establecerCestasVisitante(input);
                System.out.println("Nuevos puntos del equipo visitante registrados: " + obtenerCestasVisitante());
            }
            case 5 -> {
                System.out.println("Ingrese la nueva fecha del juego, actualmente es: " + obtenerFechaPartido());
                String input = sc.nextLine();
                establecerFechaPartido(input);
                System.out.println("Nueva fecha del juego registrada: " + obtenerFechaPartido());
            }
            default -> System.out.println("\nRegresando...\n");
        }
    }

    public void concluirPartido(){
        System.out.println("Concluir el partido");
        if(obtenerCestasLocal() == obtenerCestasVisitante()){
            System.out.println("El juego no puede concluir si no hay un equipo ganador");
            System.out.println("Marcador actual: " + obtenerCestasLocal() + "-" + obtenerCestasVisitante());
        } else {
            this.estado = false;
            System.out.println("El partido ha finalizado correctamente");
            System.out.println("Marcador: " + obtenerCestasLocal() + "-" + obtenerCestasVisitante());
        }
    }
}





