<%@page import="beans.ProductoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos</title>
</head>
<body>
	<table border="2" align="center" width="75%">
		<tr>
			<th>CODIGO</th>
			<th>DESCRIPCION</th>
			<th>PRECIO</th>
			<th>STOCK</th>
			<th>MARCA</th>
			<th colspan="2">ACCIONES</th>
		</tr>
		<%
		ArrayList<ProductoDTO> lista = (ArrayList<ProductoDTO>)request.getAttribute("data");
		if(lista != null){
			for(ProductoDTO a:lista){
			%>
			<tr>
				<td><%= a.getCodigo() %></td>
				<td><%= a.getDescription() %></td>
				<td><%= a.getPrecio() %></td>
				<td><%= a.getStock() %></td>
				<td><%= a.getNomMarca() %></td>
				<td align="center" colspan="2">
					<a href="ServletProducto?tipo=buscar&cod=<%= a.getCodigo() %>">E</a>
					<a href="ServletProducto?tipo=eliminar&cod=<%= a.getCodigo() %>">X</a>
				</td>
			</tr>
			<%
			}
		}
		%>
	</table>
</body>
</html>