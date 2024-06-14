package tp1.ejercicio3;

public class Profesor {
	private String nombre,apellido,email,catedra,facultad;

	public Profesor(String nombre, String apellido, String email, String catedra, String facultad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.catedra = catedra;
		this.facultad = facultad;
	}
	
	
	public String getApellido() {
		return apellido;
	}


	public String getEmail() {
		return email;
	}


	public String getCatedra() {
		return catedra;
	}


	public String getFacultad() {
		return facultad;
	}

	public String getNombre() {
		return this.nombre;
	}
	public String tusDatos() {
		return this.getNombre()+this.getApellido()+this.getEmail()+this.getCatedra()+this.getFacultad();
	}
	
}
