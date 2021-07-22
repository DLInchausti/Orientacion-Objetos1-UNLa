package tp;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	private LocalDate horaEntrada;
	private LocalDate horaSalida;
	private float sueldo;
	private boolean esGerente;
	public LocalDate getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalDate horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalDate getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalDate horaSalida) {
		this.horaSalida = horaSalida;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public boolean isEsGerente() {
		return esGerente;
	}
	public void setEsGerente(boolean esGerente) {
		this.esGerente = esGerente;
	}
	public Empleado(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate horaEntrada,
			LocalDate horaSalida, float sueldo, boolean esGerente) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.sueldo = sueldo;
		this.esGerente = esGerente;
	}

	public float calcularSueldo (float sueldo, Comprobante totalVenta) {
		float aux = 0;
		
		return aux;
	}
	@Override
	public String toString() {
		return "Empleado [horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", sueldo=" + sueldo
				+ ", esGerente=" + esGerente + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

}
