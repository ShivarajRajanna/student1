<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>

<div class="header">

<div class="first">
<img src="<c:url value="/images/diary1.jpeg"/>" width="60" height="60">
</div>
<div class="second">MyDiary App</div>

</div>

<br/><br/>

<hr/>
<br/><br/>
<h1>welcome  <span style="color:SteelBlue">${user.username}</span></h1> 
<a href="./signout" style="color:red;float:right">Signout</a>

<div class="bodypart">

<div class="bodypart1">
<img src="<c:url value="/images/diary1.jpeg"/>">
</div>

<div class="bodypart2">
<h1>VIEW ENTRY</h1><br/><br/><br/>
<table>
<tr><td>Date:</td><td>${entries.entrydate}</td></tr>
<tr><td>Description</td><td> ${entries.description}</td></tr>
</table>


<br/><br/><br/>
<a href="./backtohomepage"><button type="button">BACK TO HOME </button></a>

</div>
</div>

</body>
</html>