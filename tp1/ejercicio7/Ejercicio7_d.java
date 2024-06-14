package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio3.Estudiante;

public class Ejercicio7_d {
	public static void incisoD() {
		Estudiante e1= new Estudiante("Marcos","Poma");
		Estudiante e2= new Estudiante("Koda","Ona");
		Estudiante e3= new Estudiante("David","Matias");
		
		List<Estudiante> estudiantes=new ArrayList<Estudiante>();
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		for(Estudiante e : estudiantes) {
			System.out.println(e.getApellido());
		}
		ArrayList<Estudiante> nuevaLista = new ArrayList<>(estudiantes);
		nuevaLista.get(2).setApellido("ApellidoCambiado");
		for(Estudiante e : estudiantes) {
			System.out.println(e.getApellido());
		}
		Estudiante e4 = new Estudiante("Mateo", "Poma");
		if(nuevaLista.contains(e4)) {
			nuevaLista.add(e4);
		}else {
			System.out.println("el estudiante ya se encuentra en la lista ");
		}
	}
	public static void main(String[] args) {
		// los cambios de cualuier objeto de las lista original o la nueva se ven reflejados
		Ejercicio7_d.incisoD();
		
	}
}
