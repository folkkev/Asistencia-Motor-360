package co.edu.udistrital.Estructuras;

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fondo;

    public Cola() {
        this.frente = null;
        this.fondo = null;
    }

    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            this.frente = nuevoNodo;
            this.fondo = nuevoNodo;
        } else {
            this.fondo.setSiguiente(nuevoNodo);
            this.fondo = nuevoNodo;
        }
    }

    public T desencolar() {
        if (estaVacia()) {
            return null;
        }
        T dato = this.frente.getDato();
        this.frente = this.frente.getSiguiente();
        if (this.frente == null) {
            this.fondo = null;
        }
        return dato;
    }

    public T verFrente() {
        if (estaVacia()) {
            return null;
        }
        return this.frente.getDato();
    }

    public boolean estaVacia() {
        return this.frente == null;
    }
}