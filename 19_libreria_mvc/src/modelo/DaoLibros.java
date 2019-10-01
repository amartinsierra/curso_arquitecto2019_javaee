package modelo;

import java.util.List;

import javabeans.Libro;

public interface DaoLibros {

	List<Libro> recuperarLibros();

	List<Libro> recuperarLibros(int idTema);

}