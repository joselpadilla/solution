package solution;

import java.util.Arrays;

public class ArrayList<E> {

	private int size = 0;
	private int DEFAULT_CAPACITY = 10;
	private Object[] elements;
	
	public ArrayList() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(E e) {
		if(size == elements.length)
			increaseCapa();
		elements[size++] = e;
	}
	
	public void increaseCapa() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public void printList() {
		for(int i = 0; i < elements.length; i++)
			if(elements[i] != null)
				System.out.println(elements[i]);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		al.printList();
		
		ArrayList<String> al2= new ArrayList<>();
		
		al2.add("uno");
		al2.add("Dos");
		
		al2.add(null);
		al2.printList();
	}
}
