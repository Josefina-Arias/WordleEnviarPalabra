package co.edu.poli.wordle.conector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import co.edu.poli.wordle.model.Word;

public class ConectionCRUD {

	public static void main(String[] args) {


	}

	ConnectionProyect conexion = new ConnectionProyect();
	Connection refConexion = conexion.iniciarConnection();
	Statement statement = null;
	ResultSet result = null;
	PreparedStatement pst= null;

	public String consultatodo() {


		try {
			refConexion = conexion.iniciarConnection();
			statement = refConexion.createStatement();
			result = statement.executeQuery("SELECT * FROM word_list");

			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				System.out.println("Id: " + id + " Name: " + name );
			}
		} catch (SQLException e) {

		} finally {
			try {
				if (result!=null) {
					result.close();
				}
				if (statement!=null) {
					statement.close();
				}
				if (refConexion!=null) {
					refConexion.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		return "Metodo Ejecutado";

	}

	public int consultar (Word palabra) {

		int count =0;


		try {

			String SQL = "SELECT word FROM word_list WHERE word=?";

			pst = refConexion.prepareStatement(SQL);

			pst.setString(1, palabra.getName());

			result = pst.executeQuery();



			if(result.next()) {
				System.out.println("Palabra " + result.getString(1) );
				count++;
			}
		} catch (SQLException e) {
			System.err.println(e);
		}

		return count;
	}
}