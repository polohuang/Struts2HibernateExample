<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page import="com.paul.DAO.CommentDAOImpl" %>
<%@ page import="com.paul.model.Comment" %>
<%@ page import="java.util.Date" %>

<%
	CommentDAOImpl commentDAO = new CommentDAOImpl();
	int id = Integer.parseInt(request.getParameter("id"));
	Comment comment = commentDAO.findById(id);
	String title = comment.getTitle();
	String content = comment.getContent();
	Date timestamp = comment.getTimestamp();
%>
	


	<div class="jumbotron text-center">
		<h2>Comment</h2>
	</div>
	<div class="container">
		<div class="card">
		  <div class="card-header">
		    <% out.print(title); %>
		  </div>
		  <div class="card-block">
		  <!-- class="card-blockquote" -->
		    <blockquote class="card-blockquote">
		      <p><% out.print(content); %></p>
		      <footer><cite title="Source Title"><% out.print(timestamp); %></cite></footer>
		    </blockquote>
		  </div>
		</div>
	</div>
</body>
</html>