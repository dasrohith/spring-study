<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rohith's Spring MVC - Input Form </title>
</head>
<body>
<form action="processForm" method="GET">
<input type="text" name="studentName" placeholder="What's your name?" />
<input type="submit" />
</form>

<form action="processFormV2" method="GET">
<input type="text" name="studentName" placeholder="What's your name V2?" />
<input type="submit" />
</form>

<form action="processFormV3" method="GET">
<input type="text" name="studentName" placeholder="What's your name V3?" />
<input type="submit" />
</form>

</body>
</html>