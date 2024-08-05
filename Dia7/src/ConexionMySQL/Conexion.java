package ConexionMySQL;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DZ
 */
public class Conexion {
    public Connection con;
    public Conexion(){}
    public Connection establecerConexion() {
        Properties props = new Properties();
        try (InputStream input = Conexion.class.getResourceAsStream("Config.properties")) {
            if (input == null) {
                throw new IllegalStateException("Archivo config.properties no encontrado");
            }

            props.load(input);

            String url = props.getProperty("Url");
            String user = props.getProperty("Usuario");
            String password = props.getProperty("Contrasena");

            if (url == null || user == null || password == null) {
                throw new IllegalStateException("Una o más propiedades de conexión no están definidas");
            }

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            //System.out.println("Conexión exitosa a la base de datos");
        } catch (IOException | ClassNotFoundException | SQLException | IllegalStateException e) {
            System.err.println("Error en la conexión :(, error: " + e);
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.toString());
        }
        return con;
    }
    
}
