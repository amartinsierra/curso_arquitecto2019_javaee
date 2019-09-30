package factories;

import daos.DaoContactos;
import daos.DaoContactosImpl;

public class FactoryDao {
	public static DaoContactos getDaoContactos() {
		return new DaoContactosImpl();
	}
}
