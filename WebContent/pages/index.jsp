<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>Comments</h2>
	</div>
	<div class="container">
		<div class="pull-right">
			<a href="create" class="btn btn-info role="button">New</a>
		</div>
		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Content</th>
					<th>Timestamp</th>
					<th>Operation</th>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="commentList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="title"/></td>
					<td><s:property value="content"/></td>
					<td><s:property value="timestamp"/></td>
					<td>
						<a href="list?id=<s:property value="id"/>" class="btn btn-xs btn-info role="button">Link</a>
						<a href="update?id=<s:property value="id"/>" class="btn btn-xs btn-info role="button">Update</a>
						<a href="delete?id=<s:property value="id"/>" class="btn btn-xs btn-info role="button">Delete</a>
					</td>
				</tr>
			</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>