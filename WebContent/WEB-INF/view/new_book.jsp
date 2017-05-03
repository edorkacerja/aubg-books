<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding a new book</title>
</head>
<body>


	<form:form action="saveBook" modelAttribute="book" method="POST">

		<form:hidden path="bookId" />

		<table>
			<tbody>

				<tr>
					<td>Books Title</td>
					<td><form:input path="title" /></td>
				</tr>

				<tr>
					<td>Books Author</td>
					<td><form:select name="author" path="author">
							<c:forEach var="temp_author" items="${authors}">
								<option value="${temp_author}" ${book.author.name==temp_author.name ? 'selected="selected"' : ''}>${temp_author.name}</option>
							</c:forEach>
						</form:select></td>
				</tr>

				<tr>
					<td>Number of Pages</td>
					<td><form:input path="pages" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</tbody>

		</table>


	</form:form>


	<p>
		<a href="${pageContext.request.contextPath}/books/list"> Back to
			Books List </a>
	</p>



</body>
</html>