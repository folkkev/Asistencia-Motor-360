package co.edu.udistrital.Modelo;

public class UnidadMovil {
    private String placa;
    private TipoUnidad tipoUnidad;
    private String zonaUbicacion;
    private boolean disponible;

    public enum TipoUnidad {
        GRUA_PLATAFORMA,
        TALLER_MOVIL,
        MOTO_RESCATE_RAPIDO
    }

    public UnidadMovil(String placa, TipoUnidad tipoUnidad, String zonaUbicacion) {
        this.placa = placa;
        this.tipoUnidad = tipoUnidad;
        this.zonaUbicacion = zonaUbicacion;
        this.disponible = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoUnidad getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(TipoUnidad tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public String getZonaUbicacion() {
        return zonaUbicacion;
    }

    public void setZonaUbicacion(String zonaUbicacion) {
        this.zonaUbicacion = zonaUbicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}