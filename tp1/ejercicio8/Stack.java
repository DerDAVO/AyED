package tp1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> extends Sequence {
	private List<T> data;
	public Stack() {
		this.data = new ArrayList<T>();
	}

	public void push(T dato) {
		this.data.set(this.data.size(), dato);
	}
	
	public T pop() {
		return this.data.remove(this.data.size()-1);
	}
	
	public T top() {
		return this.data.get(this.data.size()-1);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.data.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.data.size()==0;
	}

}
