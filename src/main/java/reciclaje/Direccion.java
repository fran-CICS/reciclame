package reciclaje;

import javax.persistence.Embeddable;

@Embeddable
public class Direccion {
	
	private String calle;
	private Integer numero;
	private Integer piso;
	
	public Direccion() {}
	
	public Direccion(String calle, Integer numero, Integer piso) {
		this.calle=calle;
		this.numero=numero;
		this.piso=piso;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
}
