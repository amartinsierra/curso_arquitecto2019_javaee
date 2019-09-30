package daos;

import java.util.List;

import model.Contacto;

public interface DaoContactos {

	void altaContacto();

	void altaContacto(Contacto contacto);

	List<Contacto> recuperarContactos();

	void eliminarContacto(int id);

}