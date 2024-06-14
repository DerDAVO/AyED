package tp1.ejercicio8;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> extends Sequence{
	protected List<T> data;
	
	//Se usa LinkedList, que tiene una referencia al principio y otra al final
	public Queue() {
		this.data=new LinkedList<T>();
	}
	public void enqueue(T dato) {
		// TODO Auto-generated method stub
		this.data.add(dato);
	}
	// Retorna y elemina el primer elemento de la cola 
	public T dequeue(){
		return data.remove(0);
	}
	//solo retorna el primer elemento de la cola 
	public T head() {
		return this.data.get(0);
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
