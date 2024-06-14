package tp1.ejercicio7;

import java.util.ArrayList;

public class CapicuaMain {
	public static boolean esCapicua(ArrayList<Integer> lista) {
		//Lista = |0|1|2|2|1|0|
		int j=lista.size()-1;
		for (int i =0; i < lista.size();i++) {
			if ( lista.get(i)==lista.get(j)) {
				j=j-1;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(2);
		lista.add(1);
		lista.add(0);
		
		System.out.println(CapicuaMain.esCapicua(lista));
	}
}
