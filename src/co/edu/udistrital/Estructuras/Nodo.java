package co.edu.udistrital.Estructuras;

public class Nodo<T> {
	
private Nodo<T> siguiente;
private T Dato;

public Nodo(Nodo<T> siguiente, T dato) {
	this.siguiente = siguiente;
	this.Dato = dato;
}

public Nodo(T dato) {
	this.siguiente = null;
	this.Dato = dato;
}


public Nodo<T> getSiguiente() {
	return siguiente;
}

public void setSiguiente(Nodo<T> siguiente) {
	this.siguiente = siguiente;
}

public T getDato() {
	return Dato;
}

public void setDato(T dato) {
	this.Dato = dato;
}



}
