package com.paul.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paul.DAO.CommentDAOImpl;
import com.paul.model.Comment;

public class UpdateAction extends ActionSupport {
	private Comment comment;
	private int id;
	private String title;
	private String content;

	public String execute() {
		CommentDAOImpl commentDAO = new CommentDAOImpl();
		comment = commentDAO.findById(id);
		comment.setTitle(title);
		comment.setContent(content);
		commentDAO.update(comment);
		return SUCCESS;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
