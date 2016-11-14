package com.paul.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.paul.model.Comment;

public class CommentDAOImpl implements CommentDAO<Comment, Integer> {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		entityManagerFactory =  Persistence.createEntityManagerFactory("comment");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	@Override
	public void addComment(Comment entity) {
		entityManager =  getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		close();
	}

	@Override
	public void delete(Integer id) {
		entityManager =  getEntityManager();
		Comment entity = findById(id);
		System.out.println(entity.toString());
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		close();
	}

	public void delete(Comment entity) {
		entityManager =  getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		close();
	}
	
	@Override
	public void update(Comment entity) {
		entityManager =  getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		close();
	}

	@Override
	public Comment findById(Integer id) {
		entityManager =  getEntityManager();
		Comment comment = (Comment) entityManager.find(Comment.class, id);
		close();
		return comment;
	}

	@Override
	public List<Comment> findAll() {
		entityManager =  getEntityManager();
		List<Comment> comments = (List<Comment>) entityManager.createQuery("from Comment", Comment.class).getResultList();
		close();
		return comments;
	}

	@Override
	public void deleteAll() {
		entityManager =  getEntityManager();
		List<Comment> comments = findAll();
		entityManager.getTransaction().begin();
		for(Comment comment : comments) {
			delete(comment);
		}
		entityManager.getTransaction().commit();
		close();
	}

	public void close() {
//		if(entityManager != null)
//			entityManager.close();
//		if(entityManagerFactory != null)
//			entityManagerFactory.close();
	}
}
