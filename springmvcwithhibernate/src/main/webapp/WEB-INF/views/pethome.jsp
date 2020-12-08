<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PET PAGE</title>
</head>
<body>

	<table>
		<c:forEach var="pet" items="${€€‹pageScope.allpets}€‹">
			<c:out value="${pet.petId}€‹" />
			<c:out value="${€pet.petName}€‹" />
			<c:out value="${pet.petAge}" />
			<c:out value="${€‹pet.petPlace}€‹" />

		</c:forEach>
	</table>
</body>
</html>