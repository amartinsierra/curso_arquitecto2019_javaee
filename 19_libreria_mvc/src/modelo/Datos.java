package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datos {
	static {
		try {
			//cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	static Connection obtenerConexion() {
		//crear conexión con base de datos
		Connection cn=null;
		try {
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros", "root", "root");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return cn;
	}
}
