package pe.com.retaurante.entity;

public class Pedidos {
	private int idpedidos;
	private String fecha;
	private String direccion_entrega;
	private int idusuario;
	public Pedidos() {
		super();
	}
	public Pedidos(int idpedidos, String fecha, String direccion_entrega, int idusuario) {
		super();
		this.idpedidos = idpedidos;
		this.fecha = fecha;
		this.direccion_entrega = direccion_entrega;
		this.idusuario = idusuario;
	}
	public int getIdpedidos() {
		return idpedidos;
	}
	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion_entrega() {
		return direccion_entrega;
	}
	public void setDireccion_entrega(String direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
}
