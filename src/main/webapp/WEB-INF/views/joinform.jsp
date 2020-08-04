<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
	<h1>
		<a href="/simple01">Hello world !</a>
	</h1>
	
	<div class="jumbotron">
		<p>
			The time on the server is ${serverTime}.<br/> 
			<a href="aajoin">aajoinform</a><br/>
			<a href="aaselectall">aaselectall</a>
		</p>	
	</div>
	
	<div class="row">
		<form action="aajoin" method="post">
			aa <input class="form-control" type="text" name="aa">
			bb <input class="form-confrol" type="text" name="bb">
			<input class="btn btn-primary" type="submit" value="저장"/>
		</form>	
	</div>
</div>
</body>
</html>