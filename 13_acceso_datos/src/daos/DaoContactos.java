package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;

public class DaoContactos {
	private static final String url="jdbc:mysql://localhost:3306/agenda";
	private static final String user="root";
	private static final String pwd="root";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void altaContacto() {
		try(Connection con=DriverManager.getConnection(url,user,pwd);){
			String sql="insert into contactos(nombre,email,edad) values(";
			sql+="'jdbc','jdbc@gmail.com',50)";
			Statement st=con.createStatement();
			st.execute(sql);
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void altaContacto(Contacto contacto) {
		/*try(Connection con=DriverManager.getConnection(url,user,pwd);){
			String sql="insert into contactos(nombre,email,edad) values(";
			sql+="'"+contacto.getNombre()+"','"+contacto.getEmail()+"',"+contacto.getEdad()+")";
			Statement st=con.createStatement();
			st.execute(sql);
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}*/
		String sql="insert into contactos(nombre,email,edad) values(?,?,?)";
		try(Connection con=DriverManager.getConnection(url,user,pwd);
				PreparedStatement prep=con.prepareStatement(sql);){	
			//asignamos valores a los parámetros
			prep.setString(1,contacto.getNombre());
			prep.setString(2,contacto.getEmail());
			prep.setInt(3,contacto.getEdad());
			//ejecutamos
			prep.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}
	public List<Contacto> recuperarContactos(){
		List<Contacto> contactos=new ArrayList<>();
		String sql="select * from contactos";
		try(Connection con=DriverManager.getConnection(url,user,pwd);
				PreparedStatement prep=con.prepareStatement(sql);
				ResultSet rs=prep.executeQuery();){
			while(rs.next()) {
				contactos.add(new Contacto(rs.getInt("idContacto"),
						rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad")));
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return contactos;
	}
}
