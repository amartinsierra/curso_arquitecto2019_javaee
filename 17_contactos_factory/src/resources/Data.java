package resources;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Data {
	public static DataSource getDataSource(String ref) {
		DataSource ds=null;
		try {
			Context ct=new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/"+ref);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds;
	}
}
