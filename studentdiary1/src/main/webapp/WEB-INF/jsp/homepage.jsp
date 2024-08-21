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

<br/>


<div class="userhome">

 welcome  <span style="color:SteelBlue">${user.username}</span>       

  <a href="./logout" style="color:SteelBlue);float:right">Signout</a>

<br/><br/><br/><br/>

<span class="heading">List of Past Entries</span>

<a href="./addentry"><button type="button" class="addbtn">Add Entry</button></a>

<br/><br/>
<table border="1">
<tr>
<th>Date</th>
<th colspan="3">Actions</th>
</tr>

<c:if test="${entries.size()==0}">
<tr><td style="font-size:20px;color:green;text-align:center" colspan="4">User not added any Diary entries till now.</td></tr>
</c:if>

<c:forEach items="${entries}" var="e">
<tr>
<td>
${e.entrydate}
 </td>
<td><a href="./viewentry?id=${e.id}">View</a></td>
<td><a href="./updateEntry?id=${e.id}">Update</a></td>
<td><a href="./deleteEntry?id=${e.id}">Delete</a></td>
</tr>

</c:forEach>

</table>
</div>

</body>
</html>