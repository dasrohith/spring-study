<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
Student is confirmed : ${student.lastName},${student.firstName}
<br><br>
Country : ${student.country}
<br><br>
Favourite Language : ${student.favouriteLanguage}

<br><br>
Operating Systems :
<c:forEach var="os" items="${student.operatingSystems}">
<ul>
<li>${os}</li>

</ul>
</c:forEach>
<br><br>
</body>
</html>