package es.cursosprhib.jpa03ejerciciojpa.tests;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;
import es.cursosprhib.jpa03ejerciciojpa.negocio.ClienteMapper;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDao;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDaoImpl;

public class TestDao {

	public static void main(String[] args) {

		ClienteDao cDao = new ClienteDaoImpl();
		
		
		//BUSCAR Cliente por su Id
		Cliente c = cDao.getById(14);
		System.out.println(c);
		System.out.println(c.getProductos());
		
		System.out.println("--------------");
		
		
		//BUSCAR Cliente por su número cliente
		Cliente c1 = cDao.getByNroCliente(10987);
		System.out.println(c1);
		System.out.println(c1.getProductos());
		
		System.out.println("--------------");

		
		//BUSCAR todos los Clientes(DTO)
		List<ClienteDto> clis = cDao.findAll();
		for (ClienteDto clienteDto : clis) {
			System.out.println(clienteDto);
		}
		
		System.out.println("--------------");
		
		
		//BUSCAR Clientes por apellido
		List<ClienteDto> clisApe = cDao.findByApellidos("ez");
		for (ClienteDto clienteDto : clisApe) {
			System.out.println(clienteDto);
		}
		
		System.out.println("--------------");
		
		
		//CREAR nuevo Cliente a partir de ClienteDto (info básica)
		ClienteDto nuevo = new ClienteDto(null, "Perez Perez", 98765);
		//Cliente cliNuevo = cDao.save(ClienteMapper.toCliente(nuevo));
		//System.out.println(cliNuevo);
		
		System.out.println("--------------");
		
		
		//MODIFICAR atributo de un Cliente
		c.setCategoria("NUEVA");
		cDao.save(c);
		
		System.out.println("--------------");

		
		//ELIMINAR Cliente por Id
		//cDao.deleteById(40);
		
		System.out.println("--------------");

		
		//ELIMINAR Cliente pasando el Objeto
		Cliente c41 = cDao.getById(41);
		Cliente c42 = cDao.getById(42);
		//cDao.delete(c41);
		//cDao.delete(c42);

	}

}
