<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>
		<a href="/simple01">Hello world !</a>
	</h1>
	
	<div class="jumbotron">
		<p>
			<h1>aa 수정</h1>
			<a href="/simple01/aajoin">aajoinform</a>
			<a href="/simple01/aaselectall">aaselectall</a>
			<a href="/simple01/aaupdate">aaupdateform</a>
		</p>
	</div>
	
	<div class="row">
		<form action="aaupdate" method="post">
			bb <input class="form-control" type="text" name="bb">
			<input class="btn-primary" type="submit" value="저장"/>
		</form>	
	</div>
</div>
</body>
</html>