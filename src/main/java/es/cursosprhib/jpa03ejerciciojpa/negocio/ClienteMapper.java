package es.cursosprhib.jpa03ejerciciojpa.negocio;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;

public class ClienteMapper {

	 public static Cliente toCliente(ClienteDto cliDto) {
		Cliente cli =  new Cliente();
		cli.setIdPersona(cliDto.getIdPersona());
		cli.setApellidos(cliDto.getApellidos());
		cli.setNroCliente(cliDto.getNroCliente());
		
		return cli;
	 }
	 
	 public static ClienteDto toClienteDto(Cliente cli) {
		 return new ClienteDto(cli.getIdPersona(), cli.getApellidos(), cli.getNroCliente());
	 }
	
}
