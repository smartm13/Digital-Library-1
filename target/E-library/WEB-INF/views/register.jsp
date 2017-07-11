<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>
<body>
	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="user">
		<table>
			<tr>
				<td><label for="name">FirstName: </label> </td>
				<td><form:input path="userFirstName" id="FirstName"/></td>
				<td><form:errors path="userFirstName" cssClass="error"/></td>
		    </tr>
	    	<tr>
				<td><label for="name">LastName: </label> </td>
				<td><form:input path="userLastName" id="LastName"/></td>
				<td><form:errors path="userLastName" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="name">username: </label> </td>
				<td><form:input path="username" id="username"/></td>
				<td><form:errors path="username" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="salary">Email : </label> </td>
				<td><form:input path="userEmail" id="Email"/></td>
				<td><form:errors path="userEmail" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="ssn">Password : </label> </td>
				<td><form:input path="userPwd" id="Password"/></td>
				<td><form:errors path="userPwd" cssClass="error"/></td>
		    </tr>
		    
			<tr>
				<td><label for="ssn">Contact : </label> </td>
				<td><form:input path="userContact" id="Contact"/></td>
				<td><form:errors path="userContact" cssClass="error"/></td>
		    </tr>
		    
		    
			<tr>
				<td><label for="ssn">User Type : </label> </td>
				<td><form:input path="userType" id="type"/></td>
				<td><form:errors path="userType" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>