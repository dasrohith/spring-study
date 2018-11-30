<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName" />
		<br>
		<br>

Last Name : <form:input path="lastName" />
		<br>
		<br>

Country : <form:select path="country">
			<%-- 						<form:options items="${student.countries}" itemLabel="countryName" itemValue = "code"/> --%>
			<form:options items="${countries}" />
		</form:select>
		<br>
		<br>
Favourite Language :
Java<form:radiobutton path="favouriteLanguage" value="Java" />
C<form:radiobutton path="favouriteLanguage" value="C" />
PHP<form:radiobutton path="favouriteLanguage" value="PHP" />
Scala<form:radiobutton path="favouriteLanguage" value="Scala" />

		<%-- <form:radiobuttons path="favouriteLanguage" items="${student.languages}" itemLabel="language" itemValue = "code"/> --%>
		<br>
		<br>
Operating Systems :
	Windows	<form:checkbox path="operatingSystems" value="win" />
	Linux	<form:checkbox path="operatingSystems" value="lin" />
	Mac Os	<form:checkbox path="operatingSystems" value="mac" />


		<br>
		<br>
		<input type="submit">
	</form:form>
</body>
</html>