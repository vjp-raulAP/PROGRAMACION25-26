/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicatema13;
 // Importa todas las clases necesarias para JDBC
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
public class PracticaT13 {
     public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/alumnos";  // URL de conexión: protocolo JDBC + host + puerto + nombre BD
        String user = "postgres";
        String password = "example";

        Connection conexion = null;

        try {
            // 1. CONEXIÓN 
            System.out.println("Conectando a la base de datos..."); //feedback usurio
            //Abrimos la conexion a la BD de la clase DriveManager
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida correctamente....\n");//feedback usurio

          
            // SELECT INICIAL
           
            System.out.println("---- Leyendo datos de alumnos ----");
            Statement stmt = conexion.createStatement();  // Statement  lo usamos para consultas simples
            ResultSet rs = stmt.executeQuery( "SELECT id, nombre, apellido, email FROM alumnos WHERE activo = true ORDER BY apellido"); // Ejecuta la consulta SELECT y guarda el resultado
            System.out.println("Se ha accedido a los datos correctamente.");
            System.out.println("\nMostrando datos...");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nombre") + " " +
                        rs.getString("apellido") + " - " +
                        rs.getString("email")
                );
            }

        
            // INSERT
           
            System.out.println("\n Insertando nuevo alumno...");

            String sqlInsert = "INSERT INTO alumnos (nombre, apellido, email, fecha_nacimiento, telefono, direccion, ciudad, codigo_postal) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
               // Se asignan valores que pide le ejercicio

            PreparedStatement psInsert = conexion.prepareStatement(sqlInsert); // PreparedStatement permite usar parámetros (?) de forma segura
            psInsert.setString(1, "Lucía");
            psInsert.setString(2, "Morales");
            psInsert.setString(3, "lucia.morales@email.com");
            psInsert.setDate(4, Date.valueOf("2004-03-15"));
            psInsert.setString(5, "611223344");
            psInsert.setString(6, "Calle Nueva 12");
            psInsert.setString(7, "Madrid");
            psInsert.setString(8, "28010");

            int filasInsertadas = psInsert.executeUpdate();
            System.out.println("Filas insertadas: " + filasInsertadas);

           
            // SELECT DEL NUEVO ALUMNO 
            //hago un select del nuevo alumno para verificar que se ha ingresado en la BD
         
            System.out.println("\n=== SELECT ALUMNO INSERTADO ===");

            String sqlSelectNuevo = "SELECT id, nombre, apellido, email FROM alumnos WHERE email = ?";
            PreparedStatement psSelect = conexion.prepareStatement(sqlSelectNuevo);
            psSelect.setString(1, "lucia.morales@email.com");

            ResultSet rsNuevo = psSelect.executeQuery();

            while (rsNuevo.next()) {
                System.out.println(
                        rsNuevo.getInt("id") + " - " +
                        rsNuevo.getString("nombre") + " " +
                        rsNuevo.getString("apellido") + " - " +
                        rsNuevo.getString("email")
                );
            }

           
            // UPDATE
           
            System.out.println("\nActualizando curso...-");

            String sqlUpdate = "UPDATE cursos SET profesor = ?, aula = ? WHERE nombre = ?";

            PreparedStatement psUpdate = conexion.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "Dr. Javier Romero");
            psUpdate.setString(2, "Z999");
            psUpdate.setString(3, "Programación Java");

            int filasActualizadas = psUpdate.executeUpdate();
            System.out.println("Filas actualizadas: " + filasActualizadas);

          
            // DELETE
           
            System.out.println("\nEliminando curso...");

            String sqlDelete = "DELETE FROM cursos WHERE nombre = ?";

            PreparedStatement psDelete = conexion.prepareStatement(sqlDelete);
            psDelete.setString(1, "Computación en la Nube");

            int eliminados = psDelete.executeUpdate();
            System.out.println("Filas eliminadas: " + eliminados);

       
            // CIERRE
            //cerramos la conexion
            conexion.close();
            System.out.println("\nConexión cerrada.");

        } catch (SQLException e) {  //añado la excepción error en base de datos
            System.out.println("Error en la conexión o consulta:");
            e.printStackTrace();
        }
    }
}
