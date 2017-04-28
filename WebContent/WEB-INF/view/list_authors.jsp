<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authors</title>
</head>
<body>


<table>
		<tr>
			<th>Name</th>
			<th>Biography</th>
			<th>Nationality</th>
		</tr>
		
		<c:forEach var="temp_author" items="${authors}">

			<!--  just a variable to define the update url and author id -->
			<c:url var="updateLink" value="/authors/updateAuthor">
				<c:param name="authorId" value="${temp_book.authorId}" />
			</c:url>

			<tr>
				<td>${ temp_author.name}</td>
				<td>${ temp_author.biography}</td>
				<td>${ temp_author.nationality}</td>
				<td> <a href="${updateLink}"> Edit </a> </td>
			</tr>
		</c:forEach>

	</table>
	
	
</body>
</html>