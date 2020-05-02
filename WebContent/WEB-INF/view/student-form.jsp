<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

<title>Student Registration Form</title>

</head>


<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
		
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country: 
		
		<!-- Remember that for path="country" spring will call setter for a Student Model (in this case based on the setup) -->
		<form:select path="country">

			<!-- for manual using spring tags list setup -->
			<%-- 		
			<form:option value="Poland" label="Poland"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="Sweden" label="Sweden"></form:option>
			<form:option value="UK" label="UK"></form:option>
			<form:option value="USA" label="USA"></form:option>
			<form:option value="Mexico" label="Mexico"></form:option>
			<form:option value="Canada" label="Canada"></form:option> --%>

			<!-- for automatic using spring tags list setup -->
			<form:options items="${theCountryOptions}" />


		</form:select>

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>










