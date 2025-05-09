package Prog2.AB3.Aufgabe2;

public class DynArray<T> {
	
	// Klassenattribute
	private static int startgroesse = 2;
	
	// Instanzattribute
	private T[] array;
	private int size;
	
	// Konstruktoren
	
	@SuppressWarnings("unchecked")
	public DynArray() {
		this.array = (T[]) new Object[startgroesse];
		this.size = 0;
	}

	public void remove(int pos) {
		if(pos < 0 || pos >= size) {
			return;
		}
		for(int i = pos; i < size; i++) {
			array[i] = array[i + 1];
		}
		size--;

	}

	public void remove() {
		if(isEmpty()) {
			return;
		}
		for(int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}

		size--;

	}

	public void delete(T e) {
		for(int i = 0; i < size; i++) {
			if(e.equals(array[i])) {
				for(int j = i; j < size - 1; j++) {
					array[j] = array[j + 1];
				}
				size--;
				return;
			}
		}
	}

	public boolean contains(T e) {
		for(int i = 0; i < size; i++) {
			if(e.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	private void decrease() {
		if (size <= array.length / 4 && array.length > startgroesse) {
			int newCapacity = array.length / 2;

			// Die Kapazität darf nicht unter der Startgröße fallen
			if (newCapacity < startgroesse) {
				newCapacity = startgroesse;
			}

			// Erstelle ein neues Array mit der reduzierten Kapazität
			T[] newArray = (T[]) new Object[newCapacity];

			// Kopiere die Elemente aus dem alten Array ins neue Array
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}

			// Verweise das Array auf das neue Array
			array = newArray;
		}
	}



	// Instanzmethoden
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public T get(int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException("ungueltige Position");
		return array[pos];
	}
	
	public void set(int pos, T v) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException("ungueltige Position");
		array[pos] = v;
	}
	
	public void add(T v) {
		if(size >= array.length)
			increase();
		// Falls Array noch nicht voll bzw nach increase
		array[size++] = v;
	}
	
	@SuppressWarnings("unchecked")
	private void increase() {
		T[] neu = (T[]) new Object[2 * array.length];
		for(int i = 0; i < array.length; i++) {
			neu[i] = array[i];
		}
		this.array = neu;
	}

	// zusaetzlich
	public int capacity() {
		return array.length;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++)
			s = s+ array[i] + "\n";
		return s;
	}

}
