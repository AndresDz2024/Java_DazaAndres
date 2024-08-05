/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.sql.Connection;
import ConexionMySQL.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author DZ
 */
public class Dia7 {
    private Connection con;
    
    private static final DateTimeFormatter FechaAdecuada = DateTimeFormatter.ofPattern("yyyy-MM-dd" );
    
    private static boolean ValidarFecha(String fecha){
        try {
            LocalDate.parse(fecha, FechaAdecuada);
            return true;
        }catch(DateTimeParseException e){
            return false;
        }
    }
    
    public void VerPartidos(){
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Scanner sc = new Scanner(System.in);
        Statement st;
        ResultSet rs;
        
        System.out.println("¿Qué partidos deseas ver?");
        System.out.printf("1. Ligas%n2. PlayOffs%n3. Salir%n");
        
        int option = sc.nextInt();
        sc.nextLine();
        
        switch (option){
            case 1:
                try{
                    st = cn.con.createStatement();
                    rs = st.executeQuery("select * from Partido inner join Liga on Partido.id = Liga.id_partido");
                    while(rs.next()){
                        System.out.println("id = " + rs.getInt("id") + " Equipo Local = " + rs.getString("equipoLocal") + " Equipo Visitante = " + rs.getString("equipoVisitante") + " Cestas Local = " + rs.getInt("cestasLocal") + " Cestas Visitante = " + rs.getInt("cestasVisitante") + " Estado = " + rs.getString("estado") + " Fecha Partido = " + rs.getString("fechaPartido") + " Jornada = " + rs.getInt("jornada"));
                    }
                }catch(Exception e){
                    System.out.println("Error al obtener los datos: " + e.getMessage());
                }
            case 2:
                try{
                    st = cn.con.createStatement();
                    rs = st.executeQuery("select * from Partido inner join PlayOffs on Partido.id = PlayOffs.id_partido");
                    while(rs.next()){
                        System.out.println("id = " + rs.getInt("id") + " Equipo Local = " + rs.getString("equipoLocal") + " Equipo Visitante = " + rs.getString("equipoVisitante") + " Cestas Local = " + rs.getInt("cestasLocal") + " Cestas Visitante = " + rs.getInt("cestasVisitante") + " Estado = " + rs.getString("estado") + " Fecha Partido = " + rs.getString("fechaPartido") + " Ronda = " + rs.getInt("ronda"));
                    }
                }catch(Exception e){
                    System.out.println("Error al obtener los datos: " + e.getMessage());
                }
            case 3:
                return;
            default:
                System.out.println("La opción ingresada no es válida");
        }
    }
    
    public void CrearPartidos(){
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        int option;
        do{
            System.out.printf("¿Que Tipo de partido deseas añadir?%n1. Liga%n2. PlayOffs%n3. Regresar%n");
            option = sc.nextInt();
            sc.nextLine();
            if (option != 3){
                try {
                    System.out.println("Ingresa el nombre del equipo local: ");
                    String EquipoL = sc.nextLine();
                    System.out.println("Ingresa el nombre del equipo visitante: ");
                    String EquipoV = sc.nextLine();
                    System.out.println("Ingresa el numero de cestas del equipo local: ");
                    int CestasL = sc.nextInt();
                    System.out.println("Ingresa el numero de cestas del equipo visitante: ");
                    int CestasV = sc.nextInt();
                    sc.nextLine();
                    String Estado; 
                    while(true){
                        System.out.println("ingresa el estado del partido (Activo o Finalizado)");
                        Estado = sc.nextLine();
                        if ("Activo".equals(Estado) || "activo".equals(Estado) || "Finalizado".equals(Estado) || "finalizado".equals(Estado)){
                            break;
                        } else {
                            System.out.println("Por favor, ingresa un estado válido");
                        }
                    }
                    String fechaPartido;
                    while(true){
                        System.out.println("Ingresa la fecha del partido (YYYY-MM-DD)");
                        fechaPartido = sc.nextLine().trim();
                        if(ValidarFecha(fechaPartido)){
                            break;
                        } else {
                            System.out.println("La fecha ingresada no es válida (YYYY-MM-DD)");
                        }
                    }
                    int Jornada = 0;
                    String Ronda = null;
                    if (option == 1){
                        System.out.println("Ingresa el numero de la jornada del partido");
                        Jornada = sc.nextInt();
                        sc.nextLine();
                    } else if (option == 2){
                        while(true){
                            System.out.println("Ingresa la ronda (Octavos, Cuartos o Final)");
                            Ronda = sc.nextLine();
                            if ("Octavos".equals(Ronda) || "octavos".equals(Ronda) || "Cuartos".equals(Ronda) || "cuartos".equals(Ronda) || "Final".equals(Ronda) || "final".equals(Ronda)){
                                break;
                            } else {
                                System.out.println("Por favor, ingresa una ronda válida");
                            }
                        }
                    }
                    ps = con.prepareStatement("insert into Partido(equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, estado, fechaPartido) values (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                    if (option == 1){
                        ps2 = con.prepareStatement("insert into Liga(id_partido, jornada) values (?, ?)");
                    } else if (option == 2){
                        ps2 = con.prepareStatement("insert into PlayOffs(id_partido, ronda) values (?, ?)");                    
                    }
                    
                    ps.setString(1, EquipoL);
                    ps.setString(2, EquipoV);
                    ps.setInt(3, CestasL);
                    ps.setInt(4, CestasV);
                    ps.setString(5, Estado);
                    ps.setString(6, fechaPartido);
                    
                    ps.executeUpdate();
                    rs = ps.getGeneratedKeys();
                    
                    if(rs.next()){
                        int id_partido = rs.getInt(1);
                        ps2.setInt(1, id_partido);
                        if (option == 1){
                            ps2.setInt(2, Jornada);
                        } else if (option == 2){
                            ps2.setString(2, Ronda);
                        }
                        ps2.executeUpdate();
                    }                     
                } catch(Exception e){
                    System.out.println("Error en la insercion de datos: " + e.getMessage());
                }
            }
        }while (option != 3);
    }
    
    public void ActualizarPartidos() {
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        
        try {
            System.out.println("Ingresa el ID del partido que deseas actualizar:");
            int id_partido = sc.nextInt();
            sc.nextLine();
            
            System.out.println("¿Es un partido de Liga o de PlayOffs?");
            System.out.printf("1. Liga%n2. PlayOffs%n");
            int tipoPartido = sc.nextInt();
            sc.nextLine();
            
            String queryPartido = "UPDATE Partido SET equipoLocal = ?, equipoVisitante = ?, cestasLocal = ?, cestasVisitante = ?, estado = ?, fechaPartido = ? WHERE id = ?";
            ps = con.prepareStatement(queryPartido);
            
            System.out.println("Ingresa el nuevo nombre del equipo local:");
            String nuevoEquipoL = sc.nextLine();
            System.out.println("Ingresa el nuevo nombre del equipo visitante:");
            String nuevoEquipoV = sc.nextLine();
            System.out.println("Ingresa el nuevo número de cestas del equipo local:");
            int nuevasCestasL = sc.nextInt();
            System.out.println("Ingresa el nuevo número de cestas del equipo visitante:");
            int nuevasCestasV = sc.nextInt();
            sc.nextLine();
            String nuevoEstado;
            while (true) {
                System.out.println("Ingresa el nuevo estado del partido (Activo o Finalizado):");
                nuevoEstado = sc.nextLine();
                if ("Activo".equalsIgnoreCase(nuevoEstado) || "Finalizado".equalsIgnoreCase(nuevoEstado)) {
                    break;
                } else {
                    System.out.println("Por favor, ingresa un estado válido");
                }
            }
            String nuevaFechaPartido;
            while (true) {
                System.out.println("Ingresa la nueva fecha del partido (YYYY-MM-DD):");
                nuevaFechaPartido = sc.nextLine().trim();
                if (ValidarFecha(nuevaFechaPartido)) {
                    break;
                } else {
                    System.out.println("La fecha ingresada no es válida (YYYY-MM-DD)");
                }
            }
            
            ps.setString(1, nuevoEquipoL);
            ps.setString(2, nuevoEquipoV);
            ps.setInt(3, nuevasCestasL);
            ps.setInt(4, nuevasCestasV);
            ps.setString(5, nuevoEstado);
            ps.setString(6, nuevaFechaPartido);
            ps.setInt(7, id_partido);
            
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("El partido ha sido actualizado con éxito en la tabla Partido.");
            } else {
                System.out.println("No se encontró un partido con el ID proporcionado.");
                return;
            }
            
            if (tipoPartido == 1) {
                String queryLiga = "UPDATE Liga SET jornada = ? WHERE id_partido = ?";
                ps2 = con.prepareStatement(queryLiga);
                
                System.out.println("Ingresa la nueva jornada del partido:");
                int nuevaJornada = sc.nextInt();
                sc.nextLine();
                
                ps2.setInt(1, nuevaJornada);
                ps2.setInt(2, id_partido);
            } else if (tipoPartido == 2) {
                String queryPlayOffs = "UPDATE PlayOffs SET ronda = ? WHERE id_partido = ?";
                ps2 = con.prepareStatement(queryPlayOffs);
                
                System.out.println("Ingresa la nueva ronda (Octavos, Cuartos, Final):");
                String nuevaRonda = sc.nextLine();
                
                ps2.setString(1, nuevaRonda);
                ps2.setInt(2, id_partido);
            } else {
                System.out.println("Tipo de partido no válido.");
                return;
            }
            
            int rowsUpdatedTipo = ps2.executeUpdate();
            if (rowsUpdatedTipo > 0) {
                System.out.println("El partido ha sido actualizado con éxito en la tabla específica.");
            } else {
                System.out.println("No se encontró un registro en la tabla específica con el ID proporcionado.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        } 
    }
    
    public void EliminarPartidos() {
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Scanner sc = new Scanner(System.in);
        PreparedStatement ps = null;
        
        try {
            System.out.println("Ingresa el ID del partido que deseas eliminar:");
            int id_partido = sc.nextInt();
            sc.nextLine();
            
            System.out.println("¿Es un partido de Liga o de PlayOffs?");
            System.out.printf("1. Liga%n2. PlayOffs%n");
            int tipoPartido = sc.nextInt();
            sc.nextLine();
            
            if (tipoPartido == 1) {
                String queryLiga = "DELETE FROM Liga WHERE id_partido = ?";
                ps = con.prepareStatement(queryLiga);
                ps.setInt(1, id_partido);
                int rowsDeleted = ps.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("El partido ha sido eliminado de la tabla Liga.");
                } else {
                    System.out.println("No se encontró un registro en la tabla Liga con el ID proporcionado.");
                }
            } else if (tipoPartido == 2) {
                String queryPlayOffs = "DELETE FROM PlayOffs WHERE id_partido = ?";
                ps = con.prepareStatement(queryPlayOffs);
                ps.setInt(1, id_partido);
                int rowsDeleted = ps.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("El partido ha sido eliminado de la tabla PlayOffs.");
                } else {
                    System.out.println("No se encontró un registro en la tabla PlayOffs con el ID proporcionado.");
                }
            } else {
                System.out.println("Tipo de partido no válido.");
                return;
            }
            
            String queryPartido = "DELETE FROM Partido WHERE id = ?";
            ps = con.prepareStatement(queryPartido);
            ps.setInt(1, id_partido);
            int rowsDeletedPartido = ps.executeUpdate();
            if (rowsDeletedPartido > 0) {
                System.out.println("El partido ha sido eliminado de la tabla Partido.");
            } else {
                System.out.println("No se encontró un partido con el ID proporcionado.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        } 
    }
   
    public static void main(String[] args) {
        Dia7 dia7 = new Dia7();
        Scanner sc = new Scanner(System.in);
        int option;
        
        do{
            System.out.printf("Bienvenido Usuario, ¿Qué desea hacer?%n1. Añadir un partido%n2. Ver partidos ya existentes%n3. Actualizar datos de partidos%n4. Eliminar un partido%n5. Salir%n");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    dia7.CrearPartidos();
                    break;
                case 2:
                    dia7.VerPartidos();
                    break;
                case 3:
                    dia7.ActualizarPartidos();
                    break;
                case 4:
                    dia7.EliminarPartidos();
                    break;
                case 5:
                    System.out.println("Hasta pronto Usuario");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }while(option != 5);
                
    }
    
}