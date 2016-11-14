package com.paul.DAO;

import java.io.Serializable;
import java.util.List;

public interface CommentDAO<T, Id extends Serializable> {
	public void addComment(T entity);
	public void delete(Id id);
	public void update(T entity);
	public T findById(Id id);
	public List<T> findAll();
	public void deleteAll();
}
