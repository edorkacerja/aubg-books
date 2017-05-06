<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Printing Houses</title>
</head>
<body>

	<jsp:include page="navbar.jsp" flush="true" />



	<input type="button" class="button" value="Add Book Printing House"
		onclick="window.location.href='newHouse'; return false;" />

	<table>
		<tr>
			<th>Name</th>
			<th>Address</th>
		</tr>

		<c:forEach var="temp_house" items="${houses}">


			<tr>
				<td>${ temp_house.name}</td>
				<td>${ temp_house.address}</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>