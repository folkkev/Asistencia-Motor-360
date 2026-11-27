package co.edu.udistrital.Modelo;

public class Cliente {
    private int cc;
    private String nombre;
    private TipoCliente tipoCliente;
    private int telefono;

    public enum TipoCliente {
        PARTICULAR(1),
        FLOTA(2),
        ASEGURADORA(3);
    	
        private final int puntos;

        TipoCliente(int puntosBase) {
            this.puntos = puntosBase;
        }

        public int getPuntos() {
            return puntos;
        }
    }

    public Cliente(int cc, String nombre, TipoCliente tipoCliente, int telefono) {
        this.cc = cc;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.telefono = telefono;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}