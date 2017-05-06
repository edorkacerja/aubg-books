<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="navbar.jsp" flush="true" />


	<form:form action="saveHouse" modelAttribute="house" method="POST">

		<form:hidden path="bookPrintingHouseId" />

		<table>
			<tbody>

				<tr>
					<td>Printing House name</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td>Address</td>
					<td><form:input path="address" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Save"  class="button"/></td>
				</tr>
			</tbody>

		</table>


	</form:form>




</body>
</html>