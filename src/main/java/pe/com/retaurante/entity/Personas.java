package pe.com.retaurante.entity;

public class Personas {
	private int idpersonas;
	private String nombre;
	private String correo;
	private String telefono;
	public Personas() {
		super();
	}
	public Personas(int idpersonas, String nombre, String correo, String telefono) {
		super();
		this.idpersonas = idpersonas;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getIdpersonas() {
		return idpersonas;
	}
	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
