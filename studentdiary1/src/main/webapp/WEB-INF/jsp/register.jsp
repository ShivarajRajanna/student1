<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="jakarta.tags.core" %>
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

<div class="bodypart">

<div class="bodypart1">
<img src="<c:url value="/images/diary1.jpeg"/>" width="300" height="280">
</div>

<div class="bodypart2">
<h1>REGISTRATION FORM</h1><br/><br/><br/>
<form action="./saveuser" >
<label>username</label> <input type="text" name="username" class="formcontrol"><br/><br/>
<label>password</label> <input type="password" name="password" class="formcontrol"><br/><br/><br/>
<button type="submit">REGISTER</button>

</form>
<br/><br/>

Existing User? <a href="./login"> Login</a> here
</div>
</div>

</body>
</html>



