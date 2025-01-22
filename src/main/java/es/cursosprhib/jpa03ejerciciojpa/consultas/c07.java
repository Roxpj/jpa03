package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c07 {

	//7. Listar los Productos con el precio mayor (pueden ser varios con el mismo precio)

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select p from Producto p where p.precio = (select max(p.precio) from Producto p)";
		TypedQuery<Producto> q2 = em.createQuery(jpql, Producto.class);
		
		List<Producto> prods = q2.getResultList();
		
		for (Producto producto : prods) {
			System.out.println(producto);
		}
		
	
	}
}