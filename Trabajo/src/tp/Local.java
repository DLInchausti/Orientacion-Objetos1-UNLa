package tp;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Local {

	private int idLocal;
	private int telefono;
	private String direccion;
	private double latitud;
	private double altitud;
	private List<Lote> lotes;
	private List<Empleado> empleados;
	private List<Cliente> clientes;
	private List<Comprobante> comprobantes;

	public Local(int idLocal, int telefono, String direccion, double latitud, double altitud) {
		this.idLocal = idLocal;
		this.telefono = telefono;
		this.direccion = direccion;
		this.latitud = latitud;
		this.altitud = altitud;
		this.lotes = new ArrayList<Lote>();
		this.empleados = new ArrayList<Empleado>();
		this.clientes = new ArrayList<Cliente>();
		this.comprobantes = new ArrayList<Comprobante>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(float altitud) {
		this.altitud = altitud;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public List<Comprobante> getComprobantes() {
		return comprobantes;
	}

	

	@Override
	public String toString() {
		return "Local [idLocal=" + idLocal + ", telefono=" + telefono + ", direccion=" + direccion + ", latitud="
				+ latitud + ", altitud=" + altitud + "]";
	}

	public boolean agregarLote(int cant, Producto p) {

		// int id= this.getLotes().get( this.getLotes().size() ).getIdLote()+1;
		int id = this.getLotes().size()+1;
		Lote a = new Lote(id, this, LocalDate.now(), p, cant, cant);
		return this.getLotes().add(a);
	}

	public Lote traerLote(int id) {
		Lote aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getLotes().size() && !flag) {
			if (this.getLotes().get(i).getIdLote() == id) {
				aux = this.getLotes().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}
	
	
	
	
	
	
	
	
	public Empleado traerEmpleado(int dni) {
		Empleado aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getEmpleados().size() && !flag) {
			if (this.getEmpleados().get(i).getDni() == dni) {
				aux = this.getEmpleados().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}

	public boolean agregarEmpleado(String nombre, String apellido, int dni, LocalDate fecha, LocalDate entrada,
			LocalDate salida, float sueldo, boolean gerente) {

		return this.getEmpleados().add(new Empleado(nombre, apellido, dni, fecha, entrada, salida, sueldo, gerente));
	}

	public Cliente traerCliente(int dni) {
		Cliente aux = null;
		int i = 0;
		boolean flag = false;

		while (i < this.getClientes().size() && !flag) {
			if (this.getClientes().get(i).getDni() == dni) {
				aux = this.getClientes().get(i);
				flag = true;
			}
			i = i + 1;
		}
		return aux;
	}

	public boolean agregarCliente(String nombre, String apellido, int dni, LocalDate fecha, String mail) {

		return this.getClientes().add(new Cliente(nombre, apellido, dni, fecha, mail));
	}

	public double calcularDistancia(Local local) {

		double cateto1 = local.getAltitud() - this.getAltitud();
		double cateto2 = local.getLatitud() - this.getLatitud();
		double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
		return hipotenusa;

	}

	public boolean bajaLogicaProducto(Producto p) {
		int i = 0;

		for (i = 0; i < this.getLotes().size(); i++) {

			if (this.getLotes().get(i).getProd().equals(p)) {
				if (this.getLotes().get(i).getCantidadAct() == 0) {
					this.getLotes().get(i).getProd().setActivo(false);

					return this.getLotes().get(i).getProd().getIsActivo();
				}

			}

		}

		return true;
	}

	public boolean verificarStock(Producto p, int cantidad) {
		int i=0;

		for (i=0;i<lotes.size();i++) {

			if (this.getLotes().get(i).getProd().equals(p)
					&& 
				this.getLotes().get(i).getCantidadAct() >= cantidad) {
					return true;
				}
			}

		
		return false;

	}

	public void actualizarStock(Producto p, int cantidad) {

		int i = 0;

		for (i = 0; i < lotes.size(); i++) {

			if (this.getLotes().get(i).getProd().equals(p)) {

				this.getLotes().get(i).setCantidadAct(this.getLotes().get(i).getCantidadAct() - cantidad);

			}

		}
	}

	// 10 //

	public Comprobante pedidoPropio(Cliente cliente, Empleado empleado, Producto p, int cant) throws Exception {

		if (this.verificarStock(p, cant) == false) {

			throw new Exception("No hay suficiente stock");
		}

		//int id = this.getComprobantes().get(this.getComprobantes().size()).getIdComprobante() + 1;
		
		int id = this.getComprobantes().size()+1;
		
		Comprobante c = new Comprobante(id, LocalDate.now(), empleado, cliente,this);
		
		c.getChango().add(new Chango(p, cant));

		this.actualizarStock(p, cant);
		
		
		this.bajaLogicaProducto(p);
		return c;

	}
	public Comprobante pedidoLocal(Local l,Cliente cliente, Empleado empleado, Producto pro, int cant) throws Exception {
		if ( l.verificarStock(pro, cant) == false) throw new Exception("No hay suficiente stock");
		
			int id = this.getComprobantes().get(this.getComprobantes().size()).getIdComprobante()+1;
			
			Comprobante com  = new Comprobante(id, LocalDate.now(), empleado, cliente,l);
			
			com.getChango().add(new Chango(pro, cant));

			l.actualizarStock(pro, cant);
			l.bajaLogicaProducto(pro);
			return com;
		}

}// main
