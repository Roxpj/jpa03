package es.cursosprhib.jpa03ejerciciojpa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaboradores")
public class Colaborador extends Persona {
	private static final long serialVersionUID = 1L;

	private Integer nroProveedor;
	private String servicio;
	
	public Colaborador(){
	}

	public Integer getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(Integer nroProveedor) {
		this.nroProveedor = nroProveedor;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "Colaborador [" + nroProveedor + ", " + servicio + ", " + getIdPersona() + ", " + getApellidos() + "]";
	}

}
