package co.edu.udistrital.Modelo;

public class Tecnico {
    private String idTecnico;
    private String nombre;
    private Especialidad especialidad;
    private String situacionActual;
    private String sectorPatrullaje;
    private EstadoVigente estadoVigente;
    private boolean disponible;

    public enum Especialidad {
        MECANICA_GENERAL,
        ELECTRICIDAD_AUTOMOTRIZ,
        NEUMATICOS_Y_FRENOS,
        RESCATE_PESADO,
        CERRAJERIA_VEHICULAR
    }

    public enum EstadoVigente {
        ACTIVO,
        INACTIVO
    }

    public Tecnico(String idTecnico, String nombre, Especialidad especialidad,
                   String situacionActual, String sectorPatrullaje, EstadoVigente estadoVigente) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.situacionActual = situacionActual;
        this.sectorPatrullaje = sectorPatrullaje;
        this.estadoVigente = estadoVigente;
        this.disponible = (estadoVigente == EstadoVigente.ACTIVO);
    }

    public String getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(String situacionActual) {
        this.situacionActual = situacionActual;
    }

    public String getSectorPatrullaje() {
        return sectorPatrullaje;
    }

    public void setSectorPatrullaje(String sectorPatrullaje) {
        this.sectorPatrullaje = sectorPatrullaje;
    }

    public EstadoVigente getEstadoVigente() {
        return estadoVigente;
    }

    public void setEstadoVigente(EstadoVigente estadoVigente) {
        this.estadoVigente = estadoVigente;
        if (estadoVigente != EstadoVigente.ACTIVO) {
            this.disponible = false;
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}