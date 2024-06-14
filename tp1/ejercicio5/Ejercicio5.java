package tp1.ejercicio5;

public class Ejercicio5 {
	private static Resultado resultado;
	public static int[] returnMinimoMaximoYPromedio(int[] valores) {
		int max=-9999,min=9999,total=0;
		
		for(int valor :valores) {
			if(valor > max) {
				max=valor;
			}
			if(valor < min) {
				min=valor;
			}
			total+=valor;
		}
		int[] resultado = new int[3];
		resultado[0]=min;
		resultado[1]=max;
		resultado[2]=total/valores.length;
		return resultado;
	}
	public static void minimoMaximoYPromedioConParametro(Resultado resultado,int[] valores) {
		int max=-9999,min=9999,total=0;
		for(int valor : valores) {
			if(valor > max) {
				max=valor;
			}
			if(valor < min) {
				min=valor;
			}
			total+=valor;
		}
		resultado.setMaximo(max);
		resultado.setMinimo(min);
		resultado.setPromedio(total/valores.length);
	}
	public static void minimoMaximoYPromedio(int[] valores) {
		Ejercicio5.minimoMaximoYPromedioConParametro(resultado, valores);
	}
	
	public static void main(String[] args) {
		Ejercicio5.resultado = new Resultado();
		int[] valores = new int[5];
		valores[0]=1;
		valores[1]=2;
		valores[2]=3;
		valores[3]=4;
		valores[4]=5;
		
		Ejercicio5.minimoMaximoYPromedio(valores);
		System.out.println("Maximo "+Ejercicio5.resultado.getMaximo());
		System.out.println("Minimo "+Ejercicio5.resultado.getMinimo());
		System.out.println("Promedio "+Ejercicio5.resultado.getPromedio());
	}
}
