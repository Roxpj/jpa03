package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c01 {

	//1. Listar todos los Clientes de una categoría parametrizada

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String categoria = "VIP";
		
		String jpql = "select c from Cliente c where c.categoria = :cat";
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cat", categoria);
		
		List<Cliente> clis = q.getResultList();
		
		for (Cliente cliente : clis) {
			System.out.println(cliente);
		}
		
	
	}
}

//2. Listar todos los Empleados de una categoría parametrizada
//3. Listar todos los Empleados de una categoría parametrizada que tenga un apellido determinado
//4. Listar todos los Clientes que han comprado productos de un precio mayor a uno específico
//5. Listar los Productos que ha comprado un Cliente por su Id
//6. Listar los Productos que no han sido comprados nunca
//7. Listar los Productos con el precio mayor (pueden ser varios con el mismo precio)
//8. Cantidad de Productos comprados por cada Categoria de Cliente