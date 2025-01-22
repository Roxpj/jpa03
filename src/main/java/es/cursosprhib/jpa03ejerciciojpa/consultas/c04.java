package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c04 {

	//4. Listar todos los Clientes que han comprado productos de un precio mayor a uno específico

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		double precioMin = 30;
		
		String jpql2 = "select c from Cliente c join c.productos p where p.precio > :premin order by c.nroCliente";
		TypedQuery<Cliente> q = em.createQuery(jpql2, Cliente.class);
		q.setParameter("premin", precioMin);
		
		List<Cliente> clis = q.getResultList();
		
		for (Cliente cliente : clis) {
			System.out.println(cliente);
		}
		
		//cada cliente tiene un set de productos, necesitamos un join para poder consultar los valores
	}
}
