package es.cursosprhib.jpa03ejerciciojpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMF {

	private static EntityManagerFactory emf;
	
	private EMF() {}
	
	public static EntityManagerFactory getInstance() {
	
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("cursojpa");
		}
		return emf;
	}
	
}
