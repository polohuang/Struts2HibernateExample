package com.paul.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paul.DAO.CommentDAOImpl;

public class DeleteAction extends ActionSupport {
	private int id;

	public String execute() {
		CommentDAOImpl commentDAO = new CommentDAOImpl();
		commentDAO.delete(id);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
