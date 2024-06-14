package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		LinkedList<Integer> numerosld = new LinkedList<Integer>();
		
		int num;
		System.out.println("Ingrese numeros (-1 para terminar)");
		num = sc.nextInt();
		while(num != -1) {
			numeros.add(num);
			num = sc.nextInt();
		}
		for(Integer numero: numeros) {
			System.out.println("Numero "+numero);
		}
		
		//No hay diferencia entre usar la linked list y arraylist en este caso
		// todo depende de cual sea el objetivo 
		
		System.out.println("Ingrese numeros (-1 para terminar)");
		num = sc.nextInt();
		while(num != -1) {
			numerosld.add(num);
			num = sc.nextInt();
		}
		//forma iterativa foreach
		for(int numerold : numerosld) {
			System.out.println("Numero : "+numerosld);
		}
		
		// Formas de Recorrer las listas
		//Forma iterariva for
		for(int i =0; i < numeros.size();i++) {
			 System.out.println(numeros.get(i));
		 } 
		for(int i =0; i < numerosld.size();i++) {
			 System.out.println(numerosld.get(i));
		 }
		
		// forma iterator
		Iterator<Integer> numerosIterator = numerosld.iterator();
		while(numerosIterator.hasNext()) {
			System.out.println(numerosIterator.next());
		}
		
		
	}
}
