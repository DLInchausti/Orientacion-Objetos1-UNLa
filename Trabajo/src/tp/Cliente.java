package tp;

import java.time.LocalDate;

public class Cliente extends Persona{
	
	private String email;

	public Cliente(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String email) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	
}
