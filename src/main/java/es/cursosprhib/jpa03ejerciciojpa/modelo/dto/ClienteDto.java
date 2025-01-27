package es.cursosprhib.jpa03ejerciciojpa.modelo.dto;

public class ClienteDto {
	
	private Integer idPersona;
	private String apellidos;
	private Integer nroCliente;

	public ClienteDto(Integer idPersona, String apellidos, Integer nroCliente) {
		super();
		this.idPersona = idPersona;
		this.apellidos = apellidos;
		this.nroCliente = nroCliente;
	}

	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	public String toString() {
		return "ClienteDto [idPersona=" + idPersona + ", apellidos=" + apellidos + ", nroCliente=" + nroCliente + "]";
	}

}
