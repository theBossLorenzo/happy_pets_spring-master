package ttps.spring.clasesDAO;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ttps.spring.interfacesDAO.GenericDAOInterface;

@Transactional
public class GenericDao<T> implements GenericDAOInterface<T> {
	
	private  EntityManager entityManager;

	public GenericDao(Class<T> persistentClass) {
		this.setPersistentClass(persistentClass);
	}
	
	protected Class<T> persistentClass;
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}


	
	@Override
	public T update(T entity) {
		 EntityManager entityManager = Persistence.createEntityManagerFactory("Java").createEntityManager();
		 EntityTransaction transaction = entityManager.getTransaction();
		 transaction.begin();
		 T entidad = entityManager.merge(entity);
		 transaction.commit();
		 entityManager.close();
		 return entidad;
	}

	@Override
	public void delete(T entity) {
		 EntityManager entityManager = Persistence.createEntityManagerFactory("Java").createEntityManager();
		 EntityTransaction transaction = null;
		 try {
		 transaction = entityManager.getTransaction();
		 transaction.begin();
		 entityManager.remove(entityManager.merge(entity));
		 transaction.commit();
		 }
		 catch (RuntimeException e) {
		 if ( transaction != null && transaction.isActive() ) transaction.rollback();
		 throw e; // escribir en un log o mostrar un mensaje
		 }
		 finally {
		 entityManager.close();
		 }
		}
		

	@Override
	public T delete(Serializable id) {
		T entity = ((EntityManager) Persistence.createEntityManagerFactory("Java")).find(this.getPersistentClass(), id);
				 if (entity != null) {
				 this.delete(entity);
				 }
				 return entity;
	}

	@Override
	public boolean exist(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.entityManager = em;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public T persist(T entity) {
		this.getEntityManager().persist(entity);
		return entity;
	}

	@Override
	public T search(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

}
