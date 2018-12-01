<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Kid</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
	<img
		src="${pageContext.request.contextPath}/resources/images/hello.png">
	Hello ${param.studentName}
	<br /> Hello .... ${message}

	<br>
	<button onclick="myFunction()" class="btnColor">Try it</button>

</body>
</html>