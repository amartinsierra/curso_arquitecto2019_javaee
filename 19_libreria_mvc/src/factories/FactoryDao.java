package factories;

import modelo.DaoClientes;
import modelo.DaoClientesImpl;
import modelo.DaoLibros;
import modelo.DaoLibrosImpl;
import modelo.DaoTemas;
import modelo.DaoTemasImpl;
//clase de factoria
//modificada en casa
public class FactoryDao {
	public static DaoClientes getDaoClientes() {
		return new DaoClientesImpl();
	}
	public static DaoLibros getDaoLibros() {
		return new DaoLibrosImpl();
	}
	public static DaoTemas getDaoTemas() {
		return new DaoTemasImpl();
	}
}
