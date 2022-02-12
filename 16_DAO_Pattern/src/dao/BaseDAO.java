package dao;

import java.util.List;

public interface BaseDAO<T> {

	//findAll, findById, findByUsername, update, save, delete
	
	public List<T> findAll();
	
	public T findById(int id);
	
	public int update(T item);
	public int save(T item);
	public int delete(T item);
	
	
	
}
