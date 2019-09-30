package factories;

import daos.DaoContactos;
import daos.DaoContactosImpl;
//clase de factoria
//modificada en casa
public class FactoryDao {
	public static DaoContactos getDaoContactos() {
		return new DaoContactosImpl();
	}
}
