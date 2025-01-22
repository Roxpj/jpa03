package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c03 {

	//3. Listar todos los Empleados de una categoría parametrizada que tenga un apellido determinado

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		int idCat = 5;
		String apellido = "Lavanini";
		
		String jpql = "select e from Empleado e where e.categoria.idCategoria = :cat and e.apellidos = :ape";
		TypedQuery<Empleado> q = em.createQuery(jpql, Empleado.class);
		q.setParameter("cat", idCat);
		q.setParameter("ape", apellido);
		
		List<Empleado> empls = q.getResultList();
		
		for (Empleado empleado : empls) {
			System.out.println(empleado);
		}
		
		//un empleado tiene una categoría, puedo acceder a través
	
	}
}
