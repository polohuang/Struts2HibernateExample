//package com.paul.controller;
//
//import java.util.List;
//
//import org.apache.struts2.rest.DefaultHttpHeaders;
//import org.apache.struts2.rest.HttpHeaders;
//
//import com.opensymphony.xwork2.ModelDriven;
//import com.paul.DAO.CommentDAOImpl;
//import com.paul.model.Comment;
//
//public class CommentController implements ModelDriven<Object> {
//	private CommentDAOImpl commentDAO = new CommentDAOImpl();
//	private Comment model = new Comment();
//	private Integer id;
//	private List<Comment> commentList;
//	
//	/* GET /api/users */
//	public HttpHeaders index() {
//		commentList = commentDAO.findAll();
//		return new DefaultHttpHeaders("index");
//	}
//	
//	/* GET /api/list/1 */
//	public HttpHeaders show() {
//		model = commentDAO.findById(getId());
//		return new DefaultHttpHeaders("show");
//	}
//	
//	public HttpHeaders destroy() {
//		return new DefaultHttpHeaders("destroy");
//	}
//	
//	@Override
//	public Object getModel() {
//		return (commentList != null ? commentList : model);
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		if(id != null)
//			this.model = commentDAO.findById(id);
//		this.id = id;
//	}
//
//}
