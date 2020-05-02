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

			<!-- for automatic using spring tags list setup -->
			<form:options items="${theCountryOptions}" />



			</form:select>
		<br>
		<br>
		<!-- for automatic using spring tags list setup -->
			Favorite Language:
			
			<!--  on submit, spring will call student.setFavoriteLanguage() -->
			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>


		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>










