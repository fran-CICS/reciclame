package reciclaje;

import javax.persistence.ManyToOne;

import org.joda.time.DateTime;

import db.PersistentEntity;

public class Reciclaje extends PersistentEntity {
	
	private DateTime fecha;
	private Double kilogramos;
	@ManyToOne
	private PuntoReciclaje punto;
	
	public Reciclaje() {}
	
	public DateTime getFecha() {
		return fecha;
	}
	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}
	public Double getKilogramos() {
		return kilogramos;
	}
	public void setKilogramos(Double kilogramos) {
		this.kilogramos = kilogramos;
	}
	public PuntoReciclaje getPunto() {
		return punto;
	}
	public void setPunto(PuntoReciclaje punto) {
		this.punto = punto;
	}
}
