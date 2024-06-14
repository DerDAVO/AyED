package tp1.ejercicio3;

public class Estudiante {
	private String nombre,apellido,email,direccion,comision;

	public Estudiante(String nombre, String apellido, String email, String direccion, String comision) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.comision = comision;
	}
	public Estudiante(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComision() {
		return comision;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String tusDatos() {
		return this.getNombre()+this.getApellido()+this.getEmail()+this.getDireccion()+this.getComision();
	}
}
