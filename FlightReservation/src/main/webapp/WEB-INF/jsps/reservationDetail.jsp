<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Detail</title>
</head>
<body>
<h2> Reservation Info:</h2>

Airlines: ${flight.operatingAirlines}<br/>
From: ${flight.departureCity}<br/>
To: ${flight.arrivalCity}<br/>

<form action="completeReservation" method="post">
<pre>

<h2>Passenger Info:</h2>
First Name:<input type="text" name="firstName"/>
Last Name:<input type="text" name="lastName"/>
Email:<input type="text" name="email"/>
Phone:<input type="text" name="phone"/>

<h2>Card Info:</h2>
Name on the Card:<input type="text" name="nameOnTheCard"/>
Card No.:<input type="text" name="cardNumber"/>
Expire Date:<input type="text" name="expireDate"/>
Security Code:<input type="text" name="securityCode"/>


<input type="hidden" name = flightId value="${flight.id}"/>
<input type="submit" value="confirm"/>
</pre>
</form>



</body>
</html>