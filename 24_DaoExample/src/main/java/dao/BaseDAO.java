package dao;

import java.util.List;

public interface BaseDAO<T> {

	public List<T> findAll();
	public T findOneById();
	public void update(T item);
	public void save(T item);
	public void delete(int id);
	
}
