package es.cursosprhib.jpa03ejerciciojpa.persistencia;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;

public interface ClienteDao {
	
	public Cliente save (Cliente cliente);
	
	public void deleteById (Integer id);
	
	public void delete (Cliente cliente);
	
	public Cliente getById (Integer id);
	
	public List<ClienteDto> findAll(); //como no necesitamos todos los datos de todos, usamos el dto
	
	public List<ClienteDto> findByApellidos(String apellidos);
	
	public Cliente getByNroCliente (Integer nroCliente);

}
