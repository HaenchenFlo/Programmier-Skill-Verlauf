package Prog2Wiederholung.AB10.Aufgabe1;

import Prog2Wiederholung.AB5.Aufgabe3.DynArrayWI;
import Prog2Wiederholung.AB7.Aufgabe4.Schlange;
import Prog2Wiederholung.AB7.Aufgabe4.SchlangeAlsEVL;

import java.util.Iterator;

public class BinBaum<T> implements Iterable<T> {

	// Instanzvariablen 

	protected Knoten root;

	
    // Innere Klasse ///////////////////////////////////////

	protected class Knoten {

		T value;
		Knoten links;
		Knoten rechts;

		Knoten(T v) {
			value = v;
			links = null;
			rechts = null;
		}
	}
	
	//////////////////////////////////////////////////////////////

	// Konstruktoren 

	public BinBaum() {
		root = null;
	}

	public BinBaum(T value) {
		this(null, value, null);
	}

	public BinBaum(Knoten l, T v, Knoten r) {
		root = new Knoten(v);
		root.links = l;
		root.rechts = r;
	}
	
	// Instanzmethoden /////////////////////////////////////////////////

	public boolean isEmpty() {
		return root == null;
	}

	///////////////////
	public int size() {
		return size(root);
	}

	private int size(Knoten k) {
		if(k == null) return 0;

		return 1 + size(k.links) + size(k.rechts);
	}

	///////////////////////////
	public int hoehe(){
		return hoehe(root);
	}

	private int hoehe(Knoten k){
		if (k == null) 
			return 0;
		return 1 + Math.max(hoehe(k.links), hoehe(k.rechts));
	}

	/////////////////////////////////
	public String toString() {
		return toString(root);	
	}

	private String toString(Knoten e){
		return e == null ? "" : "(" + toString(e.links) + e.value + toString(e.rechts) + ")";
	}

	////////////////////////////////////
    @Override
    public Iterator<T> iterator() {
        return new BfsIterator();
    }
    
    // Inorder-Durchlauf  ///////////////////////////
    
    public DynArrayWI<T> inorder() {
    	return inorder(root);
    }
    
    private DynArrayWI<T> inorder(Knoten k) {
    	DynArrayWI<T> arr = new DynArrayWI<>();
    	if (k == null) {
    		return arr;
    	}
    	DynArrayWI<T> links = inorder(k.links);
		DynArrayWI<T> rechts = inorder(k.rechts);
    	// "concat" von inorder(ltb), k.val, inorder(rtb):
    	for(T v: links)
    		arr.add(v);
    	arr.add(k.value);
    	for(T v: rechts)
    		arr.add(v);
    	return arr;
    }

    
    private class BfsIterator implements Iterator<T> {

		Schlange<Knoten> queue;

		BfsIterator() {
			queue = new SchlangeAlsEVL<>();
			queue.enqueue(root);
		}

		@Override
		public boolean hasNext() {
			return !queue.isEmpty();
		}

		@Override
		public T next() {
			Knoten current = queue.front();
			queue.dequeue();
			if(current.links != null) queue.enqueue(current.links);
			if(current.rechts != null) queue.enqueue(current.rechts);
			return current.value;
		}
    }

}
