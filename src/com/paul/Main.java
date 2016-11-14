package com.paul;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

import com.paul.DAO.CommentDAOImpl;
import com.paul.model.Comment;
import com.paul.service.CommentService;

public class Main {

	public static void main(String[] args) {
//		CommentService service = new CommentService();
//		List<Comment> comments = (List<Comment>) service.findAll();
//		for(Comment comment : comments) {
//			System.out.println(comment.toString());
//		}
		CommentDAOImpl commentDAO = new CommentDAOImpl();
		Comment comment = new Comment(23,"GASGEGWEGWEGW","diovdnvn12e1rn121oir");
		commentDAO.update(comment);
	}

}
