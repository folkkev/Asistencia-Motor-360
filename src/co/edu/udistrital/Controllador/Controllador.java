package co.edu.udistrital.Controllador;

import co.edu.udistrital.Estructuras.*;
import co.edu.udistrital.Modelo.*;

public class Controllador {
	
	private ListaEnlazada<Cliente> clientes;
	private ListaEnlazada<Tecnico> tecnicos;
	private ListaEnlazada<SolicitudAsistencia> solicitudes;
	private ListaEnlazada <UnidadMovil> unidades;
	
	private Cola<SolicitudAsistencia> ordinaria;
	private Cola<SolicitudAsistencia> prioritaria;
	private Cola<SolicitudAsistencia> critica;
	
	public Controllador() {
        this.clientes = new ListaEnlazada<>();
        this.tecnicos = new ListaEnlazada<>();
        this.unidades = new ListaEnlazada<>();
        this.solicitudes = new ListaEnlazada<>();
        //this.siguienteIdSolicitud = 1;

        this.ordinaria = new Cola<>();
        this.prioritaria = new Cola<>();
        this.critica = new Cola<>();
    }
	
	
	
	
}
