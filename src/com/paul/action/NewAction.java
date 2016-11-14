package com.paul.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paul.DAO.CommentDAOImpl;
import com.paul.model.Comment;

public class NewAction extends ActionSupport {
	private Comment comment;
	private String title;
	private String content;
	
	public String execute() {
		CommentDAOImpl commentDAO = new CommentDAOImpl();
		comment = new Comment(title,content);
		commentDAO.addComment(comment);
		
		return SUCCESS;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
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
