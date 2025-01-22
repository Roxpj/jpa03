package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c06 {

	//6. Listar los Productos que no han sido comprados nunca

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select p from Producto p left join p.clientes c where c.idPersona is null";
		TypedQuery<Producto> q = em.createQuery(jpql, Producto.class);
		
		List<Producto> prods = q.getResultList();
		
		for (Producto producto : prods) {
			System.out.println(producto);
		}
		
	
	}
}