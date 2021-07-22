package tp;

import java.util.ArrayList;
import java.util.List;

public class Chango {
	

	private Producto prod;
	private int cantidad;
	
	
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
	
	public Chango(Producto prod, int cantidad) {
		super();
		this.prod = prod;
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Chango [prod=" + prod + ", cantidad=" + cantidad + "]";
	}
	

	
	
}

