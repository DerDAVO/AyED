package tp1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static int[] vectorDeMultiplos(int n) {
		int[] multiplos = new int[n];
		for(int i =1; i <= n; i++) {
			multiplos[i-1]=i*n;
		}
		return multiplos;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para realizar obtener multiplos");
		int n = sc.nextInt();
		int[] resultado = Ejercicio2.vectorDeMultiplos(n);
		
		System.out.println("Multipos de "+n);
		for(int i : resultado) {
			System.out.println("Numeros"+i);
		}
	}
}
