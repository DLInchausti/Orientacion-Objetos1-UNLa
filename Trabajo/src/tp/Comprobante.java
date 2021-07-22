package tp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Comprobante {
	private int idComprobante;
	private LocalDate fecha;
	private List<Chango> chango;
	private Empleado vendedor;
	private Cliente cliente;
	private Local local;

	
	public Comprobante(int idComprobante, LocalDate fecha, Empleado vendedor, Cliente cliente, Local local) {
		super();
		this.idComprobante = idComprobante;
		this.fecha = fecha;
		this.chango = new ArrayList<Chango>();
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.local = local;
	}

	public int getIdComprobante() {
		return idComprobante;
	}

	public void setIdComprobante(int idComprobante) {
		this.idComprobante = idComprobante;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Chango> getChango() {
		return chango;
	}

	public Empleado getVendedor() {
		return vendedor;
	}

	public void setVendedor(Empleado vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Comprobante [idComprobante=" + idComprobante + ", fecha=" + fecha + ", chango=" + chango + ", vendedor="
				+ vendedor + ", cliente=" + cliente + "]";
	}

	
}