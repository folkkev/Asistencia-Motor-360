package co.edu.udistrital.Estructuras;

public class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setSiguiente(this.tope);
        this.tope = nuevoNodo;
    }

    public T pop() {
        if (estaVacia()) {
            return null;
        }
        T dato = this.tope.getDato();
        this.tope = this.tope.getSiguiente();
        return dato;
    }

    public T peek() {
        if (estaVacia()) {
            return null;
        }
        return this.tope.getDato();
    }

    public boolean estaVacia() {
        return this.tope == null;
    }
}