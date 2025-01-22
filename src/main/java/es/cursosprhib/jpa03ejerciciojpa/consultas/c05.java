package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c05 {

	//5. Listar los Productos que ha comprado un Cliente por su Id

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		int idCli = 7;
		
		String jpql = "select p from Producto p join p.clientes c where c.idPersona = :id";
		TypedQuery<Producto> q = em.createQuery(jpql, Producto.class);
		q.setParameter("id", idCli);
		
		List<Producto> prods = q.getResultList();
		
		for (Producto producto : prods) {
			System.out.println(producto);
		}
		
	
	}
}