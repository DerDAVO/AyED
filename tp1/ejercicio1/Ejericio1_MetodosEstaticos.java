package tp1.ejercicio1;

public class Ejericio1_MetodosEstaticos {
	public static void imprimirNumerosConWhile(int a , int b  ) {
		while(a <= b) {
			System.out.println("Numero: "+a);
			a++;
		}
	}

	public static void imprimirNumerosConFor(int a , int b) {
		for(int i=a; i <= b ; i++) {
			System.out.println("Numero : "+i);
		}
	}

	public static void imprimirNumerosRecursion( int a, int b ) {
		if(a <= b) {
			System.out.println("Numero : "+a);
			imprimirNumerosRecursion(a+1, b);
		}
	}
	public static void main(String[] args) {
		int a =3,b=5;
		System.out.println("Solucion con For : ");
		Ejericio1_MetodosEstaticos.imprimirNumerosConFor(a, b);
		System.out.println("Solucion con while : ");
		Ejericio1_MetodosEstaticos.imprimirNumerosConWhile(a, b);
		System.out.println("Solucion con recursividad : ");
		Ejericio1_MetodosEstaticos.imprimirNumerosRecursion(a, b);
	}
}
