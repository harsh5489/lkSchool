<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<h1>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h1>
	<form action="/lkSchoolNew/submitForm.html" method="post">
		<p>
		Student's Name : <input type="text" name='studentName'>
		</p>
		<p>
		Student's Hobby : <input type="text" name="studentHobby">
		</p>
		<input type="submit" value="Submit the form"/>
	</form>
</body>
</html>