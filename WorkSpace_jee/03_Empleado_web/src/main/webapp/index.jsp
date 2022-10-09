<%@page import="modelo.javabeans.Empleado"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Quiero cambiar el carset a utf08 -->
	<h1>Aplicacion de Gestion de empleados</h1>
	<p><a href="formAltaEmpleado.jsp">Nuevo Empleado</a></p>
	<%List<Empleado> lista = (List<Empleado>)request.getAttribute("empleados"); %>
	<table border="2">
	<tr>
	<th>Id</th><th>Nombre<th>Salario</th><th>Editar</th><th>Eliminar</th>
	<tr>
	<% for (Empleado ele: lista){ %>
		<tr>
		
		<td><%= ele.getIdEmpleado() %></td>
		<td><%= ele.getNombre() %></td>
		<td><%= ele.getSalario() %></td>
		<td><a href="empleados?opcion=editar&id=<%= ele.getIdEmpleado() %>">Editar Empleado</a></td>
		<td><a href="empleados?opcion=eliminar&id=<%= ele.getIdEmpleado() %>">Eliminar Empleado</a></td>
		</tr>
	
	<% }%>
	</table>
</body>
</html>