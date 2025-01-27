package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c08 {

	//8. Cantidad de Productos comprados por cada Categoria de Cliente // y que tengan más de cuatro unidades

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select c.categoria, count(p.idProducto) from Producto p join p.clientes c group by c.categoria having count(p.idProducto) >4";
		TypedQuery<Object[]> q = em.createQuery(jpql, Object[].class);

		List<Object[]> resu = q.getResultList();
		
		for (Object[] obj : resu) {
			System.out.println(obj[0] +": "+ obj[1]);
		}
		
	
	}
}