<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>New a comment</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js"></script>
</head>
<body>
	<div class="text-center">
		<h2>New a comment</h2>
	</div>
	<form class="form-horizontal" action="New" method="POST">
		<div class="form-group">
			<label class="control-label col-sm-2">Title:</label>
			<div class="col-xs-8">
				<input type="text" class="form-control" name="title" placeholder="Enter title">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Content:</label>
			<div class="col-xs-8">
				<textarea class="form-control" rows="5" name="content"></textarea>
			</div>
		</div>
		<div class="form-group"> 
			<div class="col-sm-offset-2 col-xs-8">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>
	
	
</body>
</html>