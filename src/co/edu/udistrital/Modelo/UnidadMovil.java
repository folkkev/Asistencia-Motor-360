package co.edu.udistrital.Modelo;

import java.util.UUID;

public class UnidadMovil {
    private final UUID uuid;
    private CategoriaUnidad categoria;
    private EstadoOperativo estadoActual;
    private String zonaOperacion;
    private NivelDisponibilidad nivelDisponibilidad;

    public enum CategoriaUnidad {
        GRUA,
        MOTOCICLETA_RESPUESTA_RAPIDA,
        VEHICULO_UTILITARIO,
        COCHE_LIGERO
    }

    public enum EstadoOperativo {
        OPERANDO,
        EN_TALLER,
        MANTENIMIENTO,
        LISTA_PARA_DESPACHO
    }

    public enum NivelDisponibilidad {
        DISPONIBLE,
        ASIGNADA,
        NO_DISPONIBLE
    }

    public UnidadMovil(CategoriaUnidad categoria, EstadoOperativo estatusActual,
                       String zonaOperacion, NivelDisponibilidad nivelDisponibilidad) {
        this.uuid = UUID.randomUUID();
        this.categoria = categoria;
        this.estadoActual = estatusActual;
        this.zonaOperacion = zonaOperacion;
        this.nivelDisponibilidad = nivelDisponibilidad;
    }

    public UUID getUuid() {
        return uuid;
    }



    public CategoriaUnidad getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaUnidad categoria) {
        this.categoria = categoria;
    }

    public EstadoOperativo getEstatusActual() {
        return estadoActual;
    }

    public void setEstatusActual(EstadoOperativo estatusActual) {
        this.estadoActual = estatusActual;
    }

    public String getZonaOperacion() {
        return zonaOperacion;
    }

    public void setZonaOperacion(String zonaOperacion) {
        this.zonaOperacion = zonaOperacion;
    }

    public NivelDisponibilidad getNivelDisponibilidad() {
        return nivelDisponibilidad;
    }

    public void setNivelDisponibilidad(NivelDisponibilidad nivelDisponibilidad) {
        this.nivelDisponibilidad = nivelDisponibilidad;
    }
}