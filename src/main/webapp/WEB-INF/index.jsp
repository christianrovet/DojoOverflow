<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="col mx-auto text-center">
			<h1>Questions Dashboard</h1>
				<table
					class="table table-secondary table-striped table-hover">
					<tr>
						<th>Question</th>
						<th>Tags</th>
					</tr>
					<c:forEach items="${questions}" var="question">
						<tr>
							<td><a href="/question/show/${question.id}">${question.question}</a></td>
						</tr>
					</c:forEach>
				</table>
		</div>
		<a href="/new/question" class="btn btn-light btn-outline-dark">Add a Question</a>
	</div>
	</body>
</html>