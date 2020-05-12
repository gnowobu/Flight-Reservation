<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>flights:</h2>

<table>

<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Departure Time</th>

</tr>

<c:forEach items="${flights}" var="flight">
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td><a href="showCompleteDetail?flightid=${flight.id}">Select</a></td>
</tr>

</c:forEach>
</table>
</body>
</html>