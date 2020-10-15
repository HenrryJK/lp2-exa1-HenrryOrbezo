package pe.com.retaurante.entity;

public class Platos {
	private int idplatos;
	private String nombre;
	private double precio;
	private int cantidad;
	public Platos() {
		super();
	}
	public Platos(int idplatos, String nombre, double precio, int cantidad) {
		super();
		this.idplatos = idplatos;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdplatos() {
		return idplatos;
	}
	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
