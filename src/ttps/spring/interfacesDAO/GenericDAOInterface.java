package ttps.spring.interfacesDAO;
import java.io.Serializable;

public interface GenericDAOInterface <T> {
	public T update (T entity);
	public void delete (T entity);
	public T delete(Serializable id);
	public boolean exist (Serializable id);
	public T persist(T entity);
	public T search (Serializable id);
}
