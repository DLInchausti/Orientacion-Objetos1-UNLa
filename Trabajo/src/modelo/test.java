package modelo;

import tp.SistemaStock;

import java.time.LocalDate;

import tp.Cliente;
import tp.Empleado;
import tp.Persona;
import tp.Local;
import tp.Lote;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaStock s = new SistemaStock();
		
		s.agregarLocal(35341111, "Calle A", 50, 10);
		s.agregarLocal(35342222, "Calle B", 70, 20);
		s.agregarLocal(35343333, "Calle D", 100, 100);
		
		
		
		s.traerLocal(1).agregarEmpleado("Nicolas", "Inchausti", 11111111, LocalDate.of(1998, 4, 20), null, null, 18000, true);
		s.traerLocal(3).agregarEmpleado("Daniel", "Frutos", 22222222, LocalDate.of(2000, 4, 18), null, null, 25000, false);
		s.traerLocal(2).agregarEmpleado("Juani", "Sanchez", 33333333, LocalDate.now(), null, null, 10000, false);
		s.traerLocal(1).agregarCliente("Juan", "Perez", 11111111, LocalDate.now(), "pepepe");
		s.traerLocal(3).agregarCliente("Juan", "Cruz", 44444444, LocalDate.now(), "papapapa");
		
		try {
			s.agregarProducto("Producto A", 100);
			s.agregarProducto("Producto B", 150);
			s.agregarProducto("Producto C", 200);
			s.agregarProducto("Producto D", 300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s.agregarProducto("Producto A", 500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s.traerProducto(1));
		System.out.println(s.traerLocal(1).traerLote(1));
		System.out.println(s.traerLocal(1).traerEmpleado(11111111));
		System.out.println(s.traerLocal(2).calcularDistancia(s.traerLocal(1)) + " mts.");
		
		
		s.traerLocal(1).agregarLote(100, s.traerProducto(1));
		s.traerLocal(1).agregarLote(100, s.traerProducto(2));
		s.traerLocal(1).agregarLote(100, s.traerProducto(3));
		s.traerLocal(1).agregarLote(100, s.traerProducto(4));
		
		s.traerLocal(2).agregarLote(80, s.traerProducto(1));
		s.traerLocal(2).agregarLote(80, s.traerProducto(2));
		s.traerLocal(2).agregarLote(80, s.traerProducto(3));
		s.traerLocal(2).agregarLote(80, s.traerProducto(4));
		
		s.traerLocal(3).agregarLote(30, s.traerProducto(1));
		s.traerLocal(3).agregarLote(30, s.traerProducto(2));
		s.traerLocal(3).agregarLote(1, s.traerProducto(3));
		s.traerLocal(3).agregarLote(8, s.traerProducto(4));

		// BAJA LOGICA PRODUCTO
		System.out.println(s.traerProducto(1).getIsActivo());
		
		try {
			s.traerLocal(1).pedidoPropio(
							s.traerLocal(1).traerCliente(11111111), 
							s.traerLocal(1).traerEmpleado(11111111),
							s.traerProducto(1), 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(s.traerProducto(1).getIsActivo());
		
		//BAJA FISICA PRODUCTO
		System.out.println(s.traerProducto(2));
		System.out.println(s.bajaFisicaProducto(s.traerProducto(2)));
		System.out.println(s.traerProducto(2));
		
		System.out.println(s.traerProducto(3));
		
		// locales con stock de tal producto disponible
		System.out.println(s.localesPosibles(s.traerProducto(3), 5));
		
		//solicitud de pedido a otro local
		
		System.out.println(s.generarSolicitud(s.traerLocal(2),20 ,s.traerLocal(2).traerEmpleado(33333333), s.traerProducto(2)));
		
		//aceptar o rechazar la solicitud
		
		System.out.println("RESPUESTA: " + s.respuesta(s.traerLocal(2), 20, s.traerProducto(2)));
		
		// generacion de pedido con stock propio
		
		try {
			System.out.println(s.traerLocal(2).pedidoPropio(s.traerLocal(3).traerCliente(44444444), s.traerLocal(3).traerEmpleado(22222222), s.traerProducto(3), 5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("PUNTO 11");
		
		try {
		System.out.println(s.traerLocal(1).pedidoLocal(s.traerLocal(3), s.traerLocal(3).traerCliente(44444444), s.traerLocal(3).traerEmpleado(22222222), s.traerProducto(2), 20));
		} catch (Exception e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}//MAIN
