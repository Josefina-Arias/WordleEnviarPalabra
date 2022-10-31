package co.edu.poli.wordle.conector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectionProyect {
	
    Connection co;  
    Statement stm;


    public static Connection iniciarConnection(){   
        try {

            Class.forName("co.edu.poli.wordle.conector.ConectionCRUD"); 
            Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/wordle", "root", "Politecnico123*");
            Statement stm = co.createStatement();
            System.out.println("Conectado correctamente a la Base de Datos");
            return co;
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: "+e);
        } catch (SQLException e) {
            System.out.println("Error de conexion: "+e);
        } catch (Exception e) {
            System.out.println("Error desconocido: "+e);
        }
            return null;
    }
}