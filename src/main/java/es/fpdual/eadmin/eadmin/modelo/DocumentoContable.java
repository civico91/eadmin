package es.fpdual.eadmin.eadmin.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class DocumentoContable extends Documento {
	private BigDecimal importe;
	private String DNIinteresados;


public DocumentoContable (Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado,
		BigDecimal importe, String DNIinteresados) {
	super(codigo, nombre, fechaCreacion, publico, estado);
	this.importe = importe;
	this.DNIinteresados = DNIinteresados;
}

public BigDecimal getImporte() {
	return importe;
}

public String getDNIinteresados() {
	return DNIinteresados;
}

}
