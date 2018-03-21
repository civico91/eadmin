package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoPropuesta extends Documento {
	private int codigopropuesta;
	private int ejercicio;
	private String grupoPolitico;

	public DocumentoPropuesta (Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado,
			Integer codigopropuesta, Integer ejercicio, String grupoPolitico) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.codigopropuesta = codigopropuesta;
		this.ejercicio = ejercicio;
		this.grupoPolitico = grupoPolitico;
	}
	
	public Integer getcodigopropuesta() {
		return codigopropuesta;
	}
	
	public Integer getejercicio() {
		return ejercicio;
	}
	
	public String getgrupoPolitico() {
		return grupoPolitico;
	}
	
}
