package tp;

public class SolicitudStock{
	
	private int id;
	private Local local;
	private Producto prod;
	private int cantidad;
	private Empleado colaborador;
	private boolean aceptado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Empleado getColaborador() {
		return colaborador;
	}
	public void setColaborador(Empleado colaborador) {
		this.colaborador = colaborador;
	}
	public boolean isAceptado() {
		return aceptado;
	}
	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}
	public SolicitudStock(int id, Local local, Producto prod, int cantidad, Empleado colaborador, boolean aceptado) {
		super();
		this.id = id;
		this.local = local;
		this.prod = prod;
		this.cantidad = cantidad;
		this.colaborador = colaborador;
		this.aceptado = aceptado;
	}
	@Override
	public String toString() {
		return "SolicitudStock [id=" + id + ", local=" + local + ", prod=" + prod + ", cantidad=" + cantidad
				+ ", colaborador=" + colaborador + ", aceptado=" + aceptado + "]";
	}

	
	
}

	

