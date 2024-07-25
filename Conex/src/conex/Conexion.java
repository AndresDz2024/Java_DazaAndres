/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author DZ
 */
public class Conexion {
    private Connection con;

    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://bpxin0fmvng3crfyc4kq-mysql.services.clever-cloud.com:3306/bpxin0fmvng3crfyc4kq",
                "umebuygci6oisixr",
                "hW7IZzjTQX2ahZG8x9zT"
            );
            JOptionPane.showMessageDialog(null, "La conexión es un éxito :)");
        } catch (Exception e) {
            System.err.println("Error en la conexión :(, error:" + e);
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.toString());
        }
        return con;
    }

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        PreparedStatement ps = null;
        Statement st;
        ResultSet rs;
        
        try {
            //st = con.createStatement();
            //rs = st.executeQuery("SELECT id_hospital, nombre, direccion FROM hospitales");
            ps = con.prepareStatement("insert into hospitales (nombre, direccion) values (?,?)");
            ps.setString(1, "Hospital Increíble");
            ps.setString(2, "Calle imposible increible");
            ps.executeUpdate();
            //while (rs.next()) {
              //  System.out.println(rs.getInt("id_hospital") + " " + rs.getString("nombre") + " " + rs.getString("direccion"));
            //}
            con.close();
        } catch (Exception e) {
            System.err.println("Error al ejecutar la consulta: " + e);
        }     
    }
}
