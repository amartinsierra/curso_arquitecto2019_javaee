package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Datos {
	private static DataSource getDataSource(String ref) {
		DataSource ds=null;
		try {
			Context ct=new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/"+ref);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds;
	}
	public static Connection getConnection(String ref) {
		Connection cn=null;
		DataSource ds=getDataSource(ref);
		try {
			cn=ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}
