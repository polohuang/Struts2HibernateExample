package com.paul.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.paul.DAO.CommentDAO;
import com.paul.DAO.CommentDAOImpl;
import com.paul.model.Comment;

public class ListsAction extends ActionSupport {
	private List<Comment> commentList;
	private CommentDAOImpl commentDAO = new CommentDAOImpl();
	
	public String execute() {
		commentList = (List<Comment>) commentDAO.findAll();
		return SUCCESS;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	
}
