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
</div>UPDATE ENTRY</h1><br/><br/><br/>
<form action="./saveentry" method="post">
<label>entryDate</label> <input type="date" name="entrydate" value="${entries.entrydate}" class="formcontrol" ><br/><br/>
<label>description</label> 
<textarea rows="10" cols="30" name="description">
 ${entries.description}
</textarea>
<input type="hidden" name="userid" value="${entries.userid}">
<input type="hidden" name="id" value="${entries.id}">
<br/><br/><br/>
<button type="submit">UPDATE ENTRY </button>
</form>
</div>
</div>
</body>
</html>