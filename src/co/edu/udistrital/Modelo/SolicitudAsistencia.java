package co.edu.udistrital.Modelo;

public class SolicitudAsistencia {

    private int idSolicitud;
    private Cliente cliente;
    private String ubicacion;
    private UnidadMovil unidadAsignada;
    private Tecnico tecnicoAsignado;
    private EstadoSolicitud estadoSolicitud;

    public enum EstadoSolicitud {
        PENDIENTE,
        ATENDIDA,
        SOLUCIONADA
    }

    private CongestionVial congestionVial;
    private NivelRiesgo nivelRiesgo;
    private GravedadAveria gravedadAveria;

    public enum NivelRiesgo {
        BAJO(1),
        MEDIO(3),
        ALTO(5);

        private final int puntos;

        NivelRiesgo(int puntos) {
            this.puntos = puntos;
        }

        public int getPuntos() {
            return puntos;
        }
    }

    public enum CongestionVial {
        BAJA(1),
        MEDIA(3),
        ALTA(5);

        private final int puntos;

        CongestionVial(int puntos) {
            this.puntos = puntos;
        }

        public int getPuntos() {
            return puntos;
        }
    }

    public enum GravedadAveria {
        LEVE(2),
        GRAVE(5);

        private final int puntos;

        GravedadAveria(int puntos) {
            this.puntos = puntos;
        }

        public int getPuntos() {
            return puntos;
        }
    }

    private NivelPrioridad nivelPrioridad;
    private int puntajePrioridad;

    private static final int UMBRAL_PRIORITARIA = 9;
    private static final int UMBRAL_CRITICA = 14;

    public enum NivelPrioridad {
        ORDINARIA,
        PRIORITARIA,
        CRITICA
    }

    public SolicitudAsistencia(int idSolicitud, Cliente cliente, String ubicacion,
                               CongestionVial congestionVial, NivelRiesgo nivelRiesgo,
                               GravedadAveria gravedadAveria) {
        this.idSolicitud = idSolicitud;
        this.cliente = cliente;
        this.ubicacion = ubicacion;
        this.congestionVial = congestionVial;
        this.nivelRiesgo = nivelRiesgo;
        this.gravedadAveria = gravedadAveria;
        this.estadoSolicitud = EstadoSolicitud.PENDIENTE;
        recalcularTriage();
    }

    public void recalcularTriage() {
        int puntosRiesgo = (nivelRiesgo != null) ? nivelRiesgo.getPuntos() : 0;
        int puntosCongestion = (congestionVial != null) ? congestionVial.getPuntos() : 0;
        int puntosAveria = (gravedadAveria != null) ? gravedadAveria.getPuntos() : 0;
        int puntosCliente = (cliente != null && cliente.getTipoCliente() != null)
                ? cliente.getTipoCliente().getPuntos() : 0;

        this.puntajePrioridad = puntosRiesgo + puntosCongestion + puntosAveria + puntosCliente;

        if (this.puntajePrioridad >= UMBRAL_CRITICA) {
            this.nivelPrioridad = NivelPrioridad.CRITICA;
        } else if (this.puntajePrioridad >= UMBRAL_PRIORITARIA) {
            this.nivelPrioridad = NivelPrioridad.PRIORITARIA;
        } else {
            this.nivelPrioridad = NivelPrioridad.ORDINARIA;
        }
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        recalcularTriage();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public UnidadMovil getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(UnidadMovil unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public CongestionVial getCongestionVial() {
        return congestionVial;
    }

    public void setCongestionVial(CongestionVial congestionVial) {
        this.congestionVial = congestionVial;
        recalcularTriage();
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
        recalcularTriage();
    }

    public GravedadAveria getGravedadAveria() {
        return gravedadAveria;
    }

    public void setGravedadAveria(GravedadAveria gravedadAveria) {
        this.gravedadAveria = gravedadAveria;
        recalcularTriage();
    }

    public NivelPrioridad getNivelPrioridad() {
        return nivelPrioridad;
    }

    public int getPuntajePrioridad() {
        return puntajePrioridad;
    }
}