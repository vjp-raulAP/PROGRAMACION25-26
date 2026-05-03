/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatema13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

/**
 *
 * @author rulaa
 */
public class ConexionPostgres {
     public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/alumnos";
        String user = "postgres";
        String password = "example";

        Connection conexion = null;

        try {
            // 1. CONEXIÓN
            System.out.println("Conectando a la base de datos...");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida correctamente.\n");

            // ======================================================
            // SELECT
            // ======================================================
            System.out.println("=== SELECT ALUMNOS ===");

            String sqlSelect = "SELECT id, nombre, apellido, email FROM alumnos WHERE activo = true ORDER BY apellido";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sqlSelect);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nombre") + " " +
                        rs.getString("apellido") + " - " +
                        rs.getString("email")
                );
            }

            // ======================================================
            // INSERT
            // ======================================================
            System.out.println("\n=== INSERT ALUMNO ===");

            String sqlInsert = "INSERT INTO alumnos (nombre, apellido, email, fecha_nacimiento, telefono, direccion, ciudad, codigo_postal) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement psInsert = conexion.prepareStatement(sqlInsert);
            psInsert.setString(1, "Lucía");
            psInsert.setString(2, "Morales");
            psInsert.setString(3, "lucia.morales@email.com");
            psInsert.setDate(4, Date.valueOf("2004-03-15"));
            psInsert.setString(5, "611223344");
            psInsert.setString(6, "Calle Nueva 12");
            psInsert.setString(7, "Madrid");
            psInsert.setString(8, "28010");

            int insertados = psInsert.executeUpdate();
            System.out.println("Filas insertadas: " + insertados);

            // ======================================================
            // UPDATE
            // ======================================================
            System.out.println("\n=== UPDATE CURSOS ===");

            String sqlUpdate = "UPDATE cursos SET profesor = ?, aula = ? WHERE nombre = ?";

            PreparedStatement psUpdate = conexion.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "Dr. Javier Romero");
            psUpdate.setString(2, "Z999");
            psUpdate.setString(3, "Programación Java");

            int actualizados = psUpdate.executeUpdate();
            System.out.println("Filas actualizadas: " + actualizados);

            // ======================================================
            // DELETE
            // ======================================================
            System.out.println("\n=== DELETE CURSOS ===");

            String sqlDelete = "DELETE FROM cursos WHERE nombre = ?";

            PreparedStatement psDelete = conexion.prepareStatement(sqlDelete);
            psDelete.setString(1, "Computación en la Nube");

            int eliminados = psDelete.executeUpdate();
            System.out.println("Filas eliminadas: " + eliminados);

            // ======================================================
            // CIERRE CONEXIÓN
            // ======================================================
            conexion.close();
            System.out.println("\nConexión cerrada.");

        } catch (SQLException e) {
            System.out.println("Error en la conexión o consulta:");
            e.printStackTrace();
        }
    }
}
