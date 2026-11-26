package co.edu.udistrital.Modelo;

public class Tecnico {
    private int idTecnico;
    private String nombre;
    private Especialidad especialidad;
    private boolean disponible;

    public enum Especialidad {
        MECANICA_GENERAL,
        ELECTRICIDAD_AUTOMOTRIZ,
        NEUMATICOS_Y_FRENOS,
        RESCATE_PESADO
    }

    public Tecnico(int idTecnico, String nombre, Especialidad especialidad) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponible = true;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}