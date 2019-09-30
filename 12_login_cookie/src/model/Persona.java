package model;

public class Persona {
	private String usuario;
	private String email;
	private int edad;
	public Persona(String usuario, String email, int edad) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.edad = edad;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
