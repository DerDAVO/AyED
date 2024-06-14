package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {
	
	private static void helperSucesion(List<Integer> lista,int n) {
		lista.add(n);
		if(n != 1) {
			if(n%2==0) {
				helperSucesion(lista, n/2);
			}else {
				helperSucesion(lista, 3*n+1);
			}
		}
	}
	public static List<Integer> calcularSucesion (int n) {
		//código
		List<Integer> lista = new ArrayList<Integer>(); 
		helperSucesion(lista, n);
		return lista;
	}
	public static void main(String[] args) {
		ArrayList<Integer> sucecion= new ArrayList<Integer>(EjercicioSucesion.calcularSucesion(6));
		for(Integer n : sucecion) {
			System.out.println("Numero : "+n);
		}
	}
}
