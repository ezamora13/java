<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido a Cineapp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<spring:url value="/resources" var="urlPublic"></spring:url>
</head>
<body>

	${urlPublic}


	<div class="panel panel-default">
		<div class="panel-heading">Lista de Peliculas</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered  table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Titulo</th>
						<th>Duración</th>
						<th>Clasificación</th>
						<th>Genero</th>
						<th>imagen</th>
						<th>Fecha Estreno</th>
						<th>Estatus</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="#{ peliculas }" var="p">
						<tr>
							<td>${ p.id }</td>
							<td>${ p.titulo }</td>
							<td>${ p.duracion }min</td>
							<td>${ p.clasificacion }</td>
							<td>${ p.genero }</td>
							<td><img src="${urlPublic}/imagen/${ p.imagen }" width="80" height="100"/></td>
							<td>${ p.fechaEstreno }</td>
							<td>${ p.estatus }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>