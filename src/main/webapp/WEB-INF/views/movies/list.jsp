<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="../style/my-style.css">
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css">

<script type="text/javascript" src="../lib/jquery/jquery.min.js"></script>
<script type="text/javascript" src="../lib/bootstrap/js/bootstrap.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Peliculas</title>
</head>
<body>
<div class="container">
	
	<div class="row">
	
		<h2 class="col-md-12">Hello ${name}</h2>
		<input class="col-md-6 col-sm-12"type="text" value="">
		<input class="col-md-6 col-sm-12" type="text" value="">
		<button  class="btn btn-info col-md-3 col-md-offset-3">HOLA!!</button>
	</div>
	<div class="col-md-6 col-md-offset-3">
	<table class="table table-striped">
			<tr>
				<th>
					Nombre de la Pelicula
				</th>
				<th>
					Año de publicación
				</th>
			</tr>
		<c:forEach var = "item" items="${movies}">
			<tr>
				<td>
					${item.name}
				</td>
				<td>
					${item.year}
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>