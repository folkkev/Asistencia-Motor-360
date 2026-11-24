package co.edu.udistrital.Estructuras;

public class ListaEnlazada<T> {
	
	

	private Nodo<T> cabeza;
	private int tamanio;
	
	public ListaEnlazada() {
		cabeza = null;
		tamanio = 0;
	}
	
	
	public void agregarElemento(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		if(cabeza == null) {
			cabeza = nuevo;
		}else {
			Nodo<T> actual = cabeza;
			while(actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
		}
		tamanio++;
	}
	
	public boolean eliminarElemento(T dato) {
		if(cabeza == null)
			return false;
		
		if(cabeza.getDato().equals(dato)) {
			cabeza = cabeza.getSiguiente();
			tamanio--;
			return true;
		}
		
		Nodo<T> actual = cabeza;
		while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
			actual = actual.getSiguiente();
		}
		
		if(actual.getSiguiente() != null) {
			actual.setSiguiente(actual.getSiguiente().getSiguiente());
			tamanio--;
			return true;
		}
		
		return false;
	}
	
	
	public boolean contiene(T dato) {
		Nodo<T> actual = cabeza;
		while (actual != null) {
			if(actual.getDato().equals(dato)) {
				return true;
			}
			actual = actual.getSiguiente();
		}
		return false;
	}
	

	public boolean isVacia() {
		return cabeza == null;
	}
	
	public int getTamanio() {
		return tamanio;
	}
}
