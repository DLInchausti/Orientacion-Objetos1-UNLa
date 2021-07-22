package tp;

import java.time.LocalDate;

public class Producto {

	private int idProducto;
	private double precioUnidad;
	private LocalDate fechaAlta;
	private String descripcion;
	private boolean activo;

	

	public Producto(int idProducto, double precioUnidad, LocalDate fechaAlta, String descripcion, boolean activo) {
		super();
		this.idProducto = idProducto;
		this.precioUnidad = precioUnidad;
		this.fechaAlta = fechaAlta;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public boolean getIsActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
	
	public boolean equals(Producto p) {
		return this.getIdProducto()==p.getIdProducto();
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", precioUnidad=" + precioUnidad + ", fechaAlta=" + fechaAlta
				+ ", descripcion=" + descripcion + ", activo=" + activo + "]";
	}

	
	
	
	
	
}


