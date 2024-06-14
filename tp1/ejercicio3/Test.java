package tp1.ejercicio3;

public class Test {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("David", "Matias", "davo@gmail.com","50 y 120", "1-A");
		Estudiante estudiante2 = new Estudiante("Marcos", "Poma", "marcos@gmail.com","50 y 120","1-B");
		
		Profesor profesor1 = new Profesor("Martino","Lopez", "mlopez@gmail.com","ISO", "Facultad de Informatica");
		Profesor profesor2 = new Profesor("Miguel","Martinez","miguelmz@gmail.com","CADP","Facultad de Informatica");
		Profesor profesora1 = new Profesor("Laura","Cortez", "laucortezz@gmail.com", "Anotomia", "Facultad de Ciencias Medicas");
		
		//Agregando Estudiantes
		Estudiante[] estudiantes = new Estudiante[2];
		estudiantes[0] = estudiante1;
		estudiantes[1] = estudiante2;
		
		//Agregando Profes
		Profesor[] profesores=new Profesor[3];
		profesores[0] = profesor1;
		profesores[1] = profesora1;
		profesores[2] = profesor2;
		
		System.out.println("Informacion de estudiantes  ");
		for(int i =0; i < estudiantes.length; i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		System.out.println("Informacion de profes ");
		for(int i=0; i < profesores.length;i++ ) {
			System.out.println(profesores[i].tusDatos());
		}
	}
}
