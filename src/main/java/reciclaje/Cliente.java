package reciclaje;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import db.PersistentEntity;

public class Cliente extends PersistentEntity {

	private String nombre;
	private String apellido;
	@OrderColumn(name="orden")
	@JoinColumn(name="clienteId")
	@OneToMany
	private List<Reciclaje> reciclajes;
	@Embedded
	private Direccion direccion;
	
	public Cliente() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Reciclaje> getReciclajes() {
		return reciclajes;
	}
	public void setReciclajes(List<Reciclaje> reciclajes) {
		this.reciclajes = reciclajes;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
