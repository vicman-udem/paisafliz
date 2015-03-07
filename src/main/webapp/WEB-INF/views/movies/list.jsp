<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Peliculas</title>
</head>
<body>
	<h2>Hello ${name}</h2>
	<table>
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
</body>
</html>