package com.paul.service;

import java.util.List;

import com.paul.DAO.CommentDAOImpl;
import com.paul.model.Comment;

public class CommentService {
	private static CommentDAOImpl commentDAO;
	
	public CommentService() {
		commentDAO = new CommentDAOImpl();
	}
	
	public void addComment(Comment entity) {
		commentDAO.addComment(entity);
	}
	
	public void delete(Comment entity) {
		commentDAO.delete(entity);
	}
	
	public void update(Comment entity) {
		commentDAO.update(entity);
	}
	
	public Comment findById(Integer id) {
		Comment comment = commentDAO.findById(id);
		return comment;
	}
	
	public List<Comment> findAll() {
		List<Comment> comments = commentDAO.findAll();
		return comments;
	}
	
	public void deleteAll() {
		commentDAO.deleteAll();
	}
}
