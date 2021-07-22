package tp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaStock {

	private List<Producto> productos;
	private List<Comprobante> comprobantes;
	private List<Local> locales;
	private List<SolicitudStock> solicitudes;

	public SistemaStock() {
		this.productos = new ArrayList<Producto>();
		this.comprobantes = new ArrayList<Comprobante>();
		this.locales = new ArrayList<Local>();
		this.solicitudes = new ArrayList<SolicitudStock>();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public List<Comprobante> getComprobantes() {
		return comprobantes;
	}

	public List<Local> getLocales() {
		return locales;
	}

	
	public List<SolicitudStock> getSolicitudes() {
		return solicitudes;
	}

	// 7 // 
		//valido stock de los locales y separo los que cumplen con el stock y el
		// producto.
	public List<Local> localesPosibles(Producto p, int cantidad) {

		List<Local> aux = new ArrayList<Local>();
		int i,j= 0;
		for(i=0;i<locales.size();i++) {
			for(j=0;j<locales.get(i).getLotes().size();j++) {
				
				if (this.getLocales().get(i).getLotes().get(j).getProd().equals(p)
						&& 
					locales.get(i).getLotes().get(j).getCantidadAct() >= cantidad) {
					
					aux.add(locales.get(i));
				
				}
			}
			
		}
		return aux;
	}

	public Producto traerProducto(int id) {
		Producto aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getProductos().size() && !flag) {
			if (this.getProductos().get(i).getIdProducto() == id) {
				aux = this.getProductos().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}

	public Producto traerProducto(String des) {
		Producto aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getProductos().size() && !flag) {
			if (this.getProductos().get(i).getDescripcion().equalsIgnoreCase(des)) {
				aux = this.getProductos().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}

	public boolean agregarProducto(String producto, double precio) throws Exception {

		if (this.traerProducto(producto) != null)
			throw new Exception("Este Producto ya existe");

		int id = this.getProductos().size() + 1;

		return this.getProductos().add(new Producto(id, precio, LocalDate.now(), producto, true));
	}

	
	public boolean bajaFisicaProducto(Producto p) {
		
		return productos.remove(this.traerProducto(p.getIdProducto()));
		
		
	}
	
	
	
	
	
	public Local traerLocal(int id) {
		Local aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getLocales().size() && !flag) {
			if (this.getLocales().get(i).getIdLocal() == id) {
				aux = this.getLocales().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}

	public boolean agregarLocal(int telefono, String dire, double alti, double lat) {

		// int id= this.getLocales().get(this.getLocales().size()).getIdLocal()+1;
		int id = this.getLocales().size() + 1;

		return this.getLocales().add(new Local(id, telefono, dire, alti, lat));
	}

	// 8 //
	public SolicitudStock generarSolicitud(Local local, int cantidad,Empleado e, Producto pro) {

		
		
		int id= solicitudes.size()+1;
		
		return new SolicitudStock(id,local,pro,cantidad,e,true);

	}

	// 9 //
	public boolean respuesta(Local local, int cantidad, Producto p) {

		int i = 0;
		if (cantidad < local.getLotes().get(i).getCantidadAct()) {
			return true;
		}

		else {
			return false;
		}

	}
// 11 ///

	

} // main