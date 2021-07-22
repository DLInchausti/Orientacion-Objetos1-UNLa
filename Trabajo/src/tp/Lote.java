package tp;

import java.time.LocalDate;

public class Lote {
	
	private int idLote;
	private Local local;
	private LocalDate fechaIngreso;
	private Producto prod;
	private int cantidadIni;
	private int cantidadAct;

	
	
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidadIni() {
		return cantidadIni;
	}
	public void setCantidadIni(int cantidadIni) {
		this.cantidadIni = cantidadIni;
	}
	public int getCantidadAct() {
		return cantidadAct;
	}
	public void setCantidadAct(int cantidadAct) {
		this.cantidadAct = cantidadAct;
	}
	public Lote(int idLote, Local local, LocalDate fechaIngreso, Producto prod, int cantidadIni, int cantidadAct) {
		super();
		this.idLote = idLote;
		this.local = local;
		this.fechaIngreso = fechaIngreso;
		this.prod = prod;
		this.cantidadIni = cantidadIni;
		this.cantidadAct = cantidadAct;

	}
	
	
	
	
	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", local=" + local + ", fechaIngreso=" + fechaIngreso + ", cantidadIni="
				+ cantidadIni + ", cantidadAct=" + cantidadAct + ", prod=" + prod + "]";
	}
	
	
	

	

	
}
