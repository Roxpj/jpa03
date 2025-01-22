package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class c02 {

	//2. Listar todos los Empleados de una categoría parametrizada

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String categoria = "ANALISTA FUNCIONAL";
		
		String jpql = "select e from Empleado e where e.categoria.categoria = :cat";
		TypedQuery<Empleado> q = em.createQuery(jpql, Empleado.class);
		q.setParameter("cat", categoria);
		
		List<Empleado> empls = q.getResultList();
		
		for (Empleado empleado : empls) {
			System.out.println(empleado);
		}
		
	
	}
}
