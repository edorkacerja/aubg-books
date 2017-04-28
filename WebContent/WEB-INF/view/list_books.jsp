<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of books</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>


	<input type="button" value="Add book"
		onclick="window.location.href='newBook'; return false;" />

	<table>
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Pages</th>
			<th>Update</th>
		</tr>
		
		<c:forEach var="temp_book" items="${books_attribute}">

			<!--  just a variable to define the update url and book id -->
			<c:url var="updateLink" value="/books/updateBook">
				<c:param name="bookId" value="${temp_book.bookId}" />
			</c:url>
			
			<c:url var="deleteLink" value="/books/deleteBook">
				<c:param name="bookId" value="${temp_book.bookId}" />
			</c:url>

			<tr>
				<td>${ temp_book.title}</td>
				<td>${ temp_book.authorId}</td>
				<td>${ temp_book.pages}</td>
				<td> <a href="${updateLink}"> Edit </a> | <a href="${deleteLink}" onclick="if (!(confirm('Delete book?'))) return false"> Delete </a> </td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>