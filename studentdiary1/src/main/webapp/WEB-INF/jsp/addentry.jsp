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
<img src="<c:url value="/images/diary1.jpeg"/>" width="60" height="50">
</div>
<div class="second">MyDiary App</div>

</div>

<br/><br/>

<hr/>

<h1>welcome  <span style="color:SteelBlue">${user.username}</span></h1> 

<h1><a href="/backtohomepage" style="color:#3cb371;float:right">BackToHome</a></h1>

<div class="bodypart">

<div class="bodypart1">
<img src="<c:url value="/images/diary1.jpeg"/>"  width="300" height="280">
</div>

<div class="bodypart2">
<h1>ADD ENTRY</h1><br/>
<form action="./saveentry" method="POST">
<label>Date</label> <input type="date" name="entrydate" class="formcontrol"><br/><br/>
<label>Description</label> 
<textarea rows="10" cols="30" name="description">
</textarea>
<input type="hidden" name="userid" value="${user.userid}">

<br/><br/><br/>
<button type="submit">SAVE ENTRY </button>

</form>

</div>

</div>

</body>
</html>