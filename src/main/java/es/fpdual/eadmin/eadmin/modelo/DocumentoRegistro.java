package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoRegistro extends Documento {
	private String DNIinteresado;
	private String codigoRegistro;
	
	public DocumentoRegistro (Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado,
			String DNIinteresado, String codigoRegistro) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.DNIinteresado = DNIinteresado;
		this.codigoRegistro = codigoRegistro;
	}
	
	public String getDNIinteresado() {
		return DNIinteresado;
	}
	
	public String getcodigoRegistro() {
		return codigoRegistro;
	}
}
